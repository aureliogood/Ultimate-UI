#version 330
#extension GL_ARB_separate_shader_objects : require

#include <minecraft:dynamictransforms.glsl>
#include <minecraft:projection.glsl>
#include <minecraft:globals.glsl>
#include <minecraft:uui_mask.glsl>

layout(location = 0) in vec3 Position;
layout(location = 1) in vec4 Color;

layout(location = 0) out vec4 vertexColor;
layout(location = 1) out vec2 uuiGuiPos;
layout(location = 2) flat out vec4 uuiMaskWindow;

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    vertexColor = Color;
    uuiGuiPos = (ModelViewMat * vec4(Position, 1.0)).xy;
    uuiMaskWindow = uui_mask_window(ProjMat, GameTime);
    if (uui_mask_screen_dim(uuiMaskWindow, ProjMat, uuiGuiPos, Color)) {
        gl_Position = vec4(2.0, 2.0, 2.0, 1.0);
    }
}
