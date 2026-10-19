#version 330

#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:dynamictransforms.glsl>

uniform sampler2D Sampler0;

in float sphericalVertexDistance;
in float cylindricalVertexDistance;
#ifdef PER_FACE_LIGHTING
in vec4 vertexPerFaceColorBack;
in vec4 vertexPerFaceColorFront;
#else
in vec4 vertexColor;
#endif
in vec4 lightMapColor;
in vec4 overlayColor;
in vec2 texCoord0;

flat in int uuiPart;

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

out vec4 fragColor;

in float uuiClipDistance;

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

#ifdef ALPHA_CUTOUT
    if (color.a < ALPHA_CUTOUT) {
        discard;
    }
#endif
#ifdef PER_FACE_LIGHTING
    color *= (gl_FrontFacing ? vertexPerFaceColorFront : vertexPerFaceColorBack) * ColorModulator;
#else
    color *= vertexColor * ColorModulator;
#endif
#ifndef NO_OVERLAY
    color.rgb = mix(overlayColor.rgb, color.rgb, overlayColor.a);
#endif
#ifndef EMISSIVE
    color *= lightMapColor;
#endif
    fragColor = apply_fog(color, sphericalVertexDistance, cylindricalVertexDistance, FogEnvironmentalStart, FogEnvironmentalEnd, FogRenderDistanceStart, FogRenderDistanceEnd, FogColor);
}
