#version 330
#extension GL_ARB_separate_shader_objects : require

#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
#include <minecraft:fog.glsl>
#include <minecraft:sample_lightmap.glsl>
#endif

#include <minecraft:dynamictransforms.glsl>
#include <minecraft:projection.glsl>
#include <minecraft:globals.glsl>

layout(location = 0) in vec3 Position;
layout(location = 1) in vec4 Color;
layout(location = 2) in vec2 UV0;
#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
layout(location = 3) in ivec2 UV2;
#endif

#include <minecraft:hud.glsl>
#include <minecraft:uui_mask.glsl>

#if !defined(IS_GUI) && !defined(IS_SEE_THROUGH)
uniform sampler2D Sampler2;
layout(location = 0) out float sphericalVertexDistance;
layout(location = 1) out float cylindricalVertexDistance;
#endif

layout(location = 2) out vec4 vertexColor;
layout(location = 3) out vec2 texCoord0;
layout(location = 4) out float uuiClipDistance;

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
