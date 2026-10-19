#version 330

in vec3 Position;
in vec4 Color;
in vec2 UV0;
#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
in ivec2 UV2;
#endif

#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:sample_lightmap.glsl>
#endif

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>
#moj_import <minecraft:globals.glsl>
#moj_import <hud.glsl>
#moj_import <minecraft:uui_mask.glsl>

#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
uniform sampler2D Sampler2;
out float sphericalVertexDistance;
out float cylindricalVertexDistance;
#endif

out vec4 vertexColor;
out vec2 texCoord0;
out float uuiClipDistance;

void main() {
    uuiClipDistance = 1.0;
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);
#ifdef IS_GUI
    if (uui_mask_inside(uui_mask_window(ProjMat, GameTime), (ModelViewMat * vec4(Position, 1.0)).xy)) {
        gl_Position = vec4(2.0, 2.0, 2.0, 1.0);
        vertexColor = vec4(0.0);
        texCoord0 = vec2(0.0);
        return;
    }
#endif

#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
    sphericalVertexDistance = fog_spherical_distance(Position);
    cylindricalVertexDistance = fog_cylindrical_distance(Position);
    vertexColor = Color * sample_lightmap(Sampler2, UV2);
#else
    vertexColor = Color;
#endif
    texCoord0 = UV0;

    if (make_hud()) {
#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
        uuiClipDistance = uui_clip_distance(UV2, Color);
#endif
        vertexColor = Color;
#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
        sphericalVertexDistance = -1.0e6;
        cylindricalVertexDistance = -1.0e6;
#endif
    }
}