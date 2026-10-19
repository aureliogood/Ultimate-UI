#version 150

in vec4 vertexColor;
in vec2 uuiGuiPos;
flat in vec4 uuiMaskWindow;

uniform vec4 ColorModulator;

out vec4 fragColor;

#moj_import <uui_mask.glsl>

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
