#version 150

uniform sampler2D Sampler0;

uniform vec4 ColorModulator;
uniform vec2 ScreenSize;
uniform float GameTime;

in vec2 texCoord0;
flat in vec2 uuiRotation;
flat in float uuiScreenOverlay;
in vec2 uuiGuiPos;
flat in vec4 uuiMaskWindow;

out vec4 fragColor;

#moj_import <uui_cursor.glsl>

#moj_import <uui_mask.glsl>
void main() {
    if (uuiScreenOverlay > 0.5 && abs(ColorModulator.a - 0.1) < 0.02 && uui_signature()) {
        int state = uui_state(GameTime);
        if (state == 0) {
            vec4 water = uui_water_tile(texCoord0);
            if (water.a == 0.0) {
                discard;
            }
            fragColor = water * ColorModulator;
            return;
        }

        vec4 cursor;
        if (uui_cursor(uuiRotation, state, ScreenSize, cursor)) {
            fragColor = cursor;
            return;
        }
        discard;
    }

    if (uui_mask_inside(uuiMaskWindow, uuiGuiPos)) {
        discard;
    }

    vec4 color = texture(Sampler0, texCoord0);
    if (color.a == 0.0) {
        discard;
    }
    fragColor = color * ColorModulator;
}
