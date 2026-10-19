#version 330
#extension GL_ARB_separate_shader_objects : require

#include <minecraft:dynamictransforms.glsl>
#include <minecraft:uui_mask.glsl>

layout(location = 0) in vec4 vertexColor;
layout(location = 1) in vec2 uuiGuiPos;
layout(location = 2) flat in vec4 uuiMaskWindow;

layout(location = 0) out vec4 fragColor;

void main() {
    vec4 color = vertexColor;
    if (color.a == 0.0) {
        discard;
    }
    if (uuiMaskWindow.z > uuiMaskWindow.x && (uui_mask_backdrop(color) || uui_mask_inside(uuiMaskWindow, uuiGuiPos))) {
        discard;
    }
    fragColor = color * ColorModulator;
}
