#version 330

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in ivec2 UV1;
in ivec2 UV2;
in vec3 Normal;

#moj_import <minecraft:light.glsl>
#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>
#moj_import <minecraft:sample_lightmap.glsl>
#moj_import <minecraft:globals.glsl>
#moj_import <hud.glsl>

#ifndef NO_OVERLAY
uniform sampler2D Sampler1;
#endif

#ifndef EMISSIVE
uniform sampler2D Sampler2;
#endif

out float sphericalVertexDistance;
out float cylindricalVertexDistance;

#ifdef PER_FACE_LIGHTING
out vec4 vertexPerFaceColorBack;
out vec4 vertexPerFaceColorFront;
#else
out vec4 vertexColor;
#endif

#ifndef EMISSIVE
out vec4 lightMapColor;
#endif

#ifndef NO_OVERLAY
out vec4 overlayColor;
#endif

out vec2 texCoord0;

flat out int uuiPart;

#define UUI_WORLD_PART_BLOCK_LIGHT 1

out float uuiClipDistance;

void main() {
    uuiClipDistance = 1.0;
    uuiPart = 0;

    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    sphericalVertexDistance = fog_spherical_distance(Position);
    cylindricalVertexDistance = fog_cylindrical_distance(Position);

#ifdef PER_FACE_LIGHTING
    vec2 light = minecraft_compute_light(Light0_Direction, Light1_Direction, Normal);
    vertexPerFaceColorBack = minecraft_mix_light_separate(-light, Color);
    vertexPerFaceColorFront = minecraft_mix_light_separate(light, Color);
#elif defined(NO_CARDINAL_LIGHTING)
    vertexColor = Color;
#else
    vertexColor = minecraft_mix_light(Light0_Direction, Light1_Direction, Normal, Color);
#endif

#ifndef EMISSIVE
    lightMapColor = sample_lightmap(Sampler2, UV2);
#endif

#ifndef NO_OVERLAY
    overlayColor = texelFetch(Sampler1, UV1, 0);
#endif

    texCoord0 = UV0;

#ifdef APPLY_TEXTURE_MATRIX
    texCoord0 = (TextureMat * vec4(UV0, 0.0, 1.0)).xy;
#endif

    ivec2 uuiLight = UV2 / 16;
    if (uuiLight.x == UUI_WORLD_PART_BLOCK_LIGHT && uuiLight.y >= 1 && uuiLight.y <= UUI_PART_MAX) {
        uuiPart = uuiLight.y;
#ifndef EMISSIVE
        lightMapColor = vec4(1.0);
#endif
    }

    if (make_hud()) {
        uuiClipDistance = uui_item_clip_distance(UV2);
        uuiPart = uuiPartId;

#ifdef PER_FACE_LIGHTING
        vertexPerFaceColorBack = Color;
        vertexPerFaceColorFront = Color;
#else
        vertexColor = Color;
#endif

#ifndef EMISSIVE
        lightMapColor = vec4(1.0); 
#endif

#ifndef NO_OVERLAY
        overlayColor = vec4(1.0);
#endif

        sphericalVertexDistance = -1.0e6;
        cylindricalVertexDistance = -1.0e6;
    }
}
