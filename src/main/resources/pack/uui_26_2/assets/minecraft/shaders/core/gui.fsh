#version 330

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:uui_mask.glsl>

in vec4 vertexColor;
in vec2 uuiGuiPos;
flat in vec4 uuiMaskWindow;

out vec4 fragColor;

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
