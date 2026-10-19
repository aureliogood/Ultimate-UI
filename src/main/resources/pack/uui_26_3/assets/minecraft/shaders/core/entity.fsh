#version 330
#extension GL_ARB_separate_shader_objects : require

#ifdef GLINT
#include <minecraft:globals.glsl>
#endif
#include <minecraft:fog.glsl>
#include <minecraft:dynamictransforms.glsl>
#include <minecraft:oit.glsl>

uniform sampler2D Sampler0;

#ifdef DISSOLVE
uniform sampler2D DissolveMaskSampler;
#endif

#ifdef GLINT
uniform sampler2D GlintSampler;
#endif

layout(location = 0) in float sphericalVertexDistance;
layout(location = 1) in float cylindricalVertexDistance;
#ifdef PER_FACE_LIGHTING
layout(location = 2) in vec4 vertexPerFaceColorBack;
layout(location = 3) in vec4 vertexPerFaceColorFront;
#else
layout(location = 2) in vec4 vertexColor;
#endif

#ifndef EMISSIVE
layout(location = 4) in vec4 lightMapColor;
#endif

#ifndef NO_OVERLAY
layout(location = 5) in vec4 overlayColor;
#endif

layout(location = 6) in vec2 texCoord0;
#ifdef GLINT
layout(location = 7) in vec2 texCoordGlint;
#endif

layout(location = 8) flat in int uuiPart;

#ifndef OIT_ALPHA_ONLY
layout(location = 0) out vec4 fragColor;
#endif

#define UUI_SKINRES 64.0

const vec4 uuiSubUv[18] = vec4[18](
    vec4(4.0,  0.0,  8.0,  4.0),
    vec4(8.0,  0.0, 12.0,  4.0),
    vec4(0.0,  4.0,  4.0, 16.0),
    vec4(4.0,  4.0,  8.0, 16.0),
    vec4(8.0,  4.0, 12.0, 16.0),
    vec4(12.0, 4.0, 16.0, 16.0),
    vec4(4.0,  0.0,  7.0,  4.0),
    vec4(7.0,  0.0, 10.0,  4.0),
    vec4(0.0,  4.0,  4.0, 16.0),
    vec4(4.0,  4.0,  7.0, 16.0),
    vec4(7.0,  4.0, 11.0, 16.0),
    vec4(11.0, 4.0, 14.0, 16.0),
    vec4(4.0,  0.0, 12.0,  4.0),
    vec4(12.0, 0.0, 20.0,  4.0),
    vec4(0.0,  4.0,  4.0, 16.0),
    vec4(4.0,  4.0, 12.0, 16.0),
    vec4(12.0, 4.0, 16.0, 16.0),
    vec4(16.0, 4.0, 24.0, 16.0)
);

const vec2 uuiOrigin[10] = vec2[10](
    vec2(40.0, 16.0),
    vec2(40.0, 32.0),
    vec2(32.0, 48.0),
    vec2(48.0, 48.0),
    vec2(16.0, 16.0),
    vec2(16.0, 32.0),
    vec2(0.0,  16.0),
    vec2(0.0,  32.0),
    vec2(16.0, 48.0),
    vec2(0.0,  48.0)
);

bool uui_is_slim(sampler2D skin) {
    vec4 a = texture(skin, vec2(54.0 / UUI_SKINRES, 20.0 / UUI_SKINRES));
    vec4 b = texture(skin, vec2(55.0 / UUI_SKINRES, 20.0 / UUI_SKINRES));
    return a.a == 0.0
        || (((a.r + a.g + a.b) == 0.0) && ((b.r + b.g + b.b) == 0.0) && a.a == 1.0 && b.a == 1.0);
}

void uui_remap(vec2 sourceUV, int partIndex, bool slim, out vec2 mappedUV, out vec2 underUV) {
    vec2 sourcePixel = sourceUV * UUI_SKINRES;
    int outerLayer = sourcePixel.x >= 32.0 ? 1 : 0;
    if (outerLayer == 1) {
        sourcePixel.x -= 32.0;
    }

    int faceId;
    vec2 sourceOrigin;
    if (sourcePixel.y < 8.0) {
        if (sourcePixel.x < 16.0) {
            faceId = 0;
            sourceOrigin = vec2(8.0, 0.0);
        } else {
            faceId = 1;
            sourceOrigin = vec2(16.0, 0.0);
        }
    } else {
        int sideFace = int(clamp(floor(sourcePixel.x / 8.0), 0.0, 3.0));
        faceId = sideFace + 2;
        sourceOrigin = vec2(float(sideFace) * 8.0, 8.0);
    }

    vec2 faceUV = clamp((sourcePixel - sourceOrigin) / 8.0, 0.0, 1.0);
    int partIdMod = partIndex % 5;
    int subuvIndex = faceId;
    if (slim && (partIdMod == 0 || partIdMod == 1)) {
        subuvIndex += 6;
    } else if (partIdMod == 2) {
        subuvIndex += 12;
    }

    vec4 subuv = uuiSubUv[subuvIndex];
    vec2 offset = mix(subuv.xy, subuv.zw, faceUV);
    mappedUV = (uuiOrigin[2 * partIdMod + outerLayer] + offset) / UUI_SKINRES;
    underUV  = (uuiOrigin[2 * partIdMod] + offset) / UUI_SKINRES;
}

vec4 calculateFinalColor(vec4 color) {
    #ifndef NO_OVERLAY
    color.rgb = mix(overlayColor.rgb, color.rgb, overlayColor.a);
    #endif

    #ifndef EMISSIVE
    color *= lightMapColor;
    #endif

    #ifdef GLINT
    vec4 glintColor = GlintAlpha * texture(GlintSampler, texCoordGlint);
    color.rgb += glintColor.rgb * glintColor.rgb;
    #endif

    #ifdef OIT_ACCUMULATE
    color = sampleColorForAccumulation(color);
    vec4 fogColor = vec4(FogColor.rgb * color.a, FogColor.a);
    #else
    vec4 fogColor = FogColor;
    #endif

    return apply_fog(color, sphericalVertexDistance, cylindricalVertexDistance, FogEnvironmentalStart, FogEnvironmentalEnd, FogRenderDistanceStart, FogRenderDistanceEnd, fogColor);
}

layout(location = 9) in float uuiClipDistance;

void main() {
    if (uuiClipDistance < 0.0) {
        discard;
    }
    vec2 uuiUV = texCoord0;
    vec2 uuiUnderUV = texCoord0;
    bool uuiActive = uuiPart > 0;
    if (uuiActive) {
        uui_remap(texCoord0, uuiPart - 1, uui_is_slim(Sampler0), uuiUV, uuiUnderUV);
    }

    vec4 color = texture(Sampler0, uuiUV);

    if (uuiActive && color.a > 0.0 && color.a < 1.0) {
        vec3 uuiUnder = texture(Sampler0, uuiUnderUV).rgb;
        color = vec4(mix(uuiUnder, color.rgb, color.a), 1.0);
    }

    #ifdef OIT_ADDITIVE
    color.a = min(0.99, color.a);
    #endif

    #ifdef ALPHA_CUTOUT
    if (color.a < ALPHA_CUTOUT) {
        discard;
    }
    #endif

    #ifdef PER_FACE_LIGHTING
    vec4 faceVertexColor = gl_FrontFacing ? vertexPerFaceColorFront : vertexPerFaceColorBack;
    #else
    vec4 faceVertexColor = vertexColor;
    #endif

    #ifdef DISSOLVE
    if (faceVertexColor.a < texture(DissolveMaskSampler, texCoord0).a) {
        discard;
    }
    faceVertexColor.a = 1.0;
    #endif

    color *= faceVertexColor * ColorModulator;

    #ifdef GLINT
    color.a = max(color.a, GlintAlpha);
    #endif

    #ifdef OIT_ALPHA_ONLY
    executeAlphaOnlyPhase(gl_FragCoord.z, color.a);
    #else
    fragColor = calculateFinalColor(color);
    #endif
}
