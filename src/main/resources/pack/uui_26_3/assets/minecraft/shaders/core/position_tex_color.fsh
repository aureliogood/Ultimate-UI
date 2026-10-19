#version 330
#extension GL_ARB_separate_shader_objects : require

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    mat4 TextureMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
};
layout(std140) uniform Globals {
    ivec3 CameraBlockPos;
    float GlintAlpha;
    vec3 CameraOffset;
    float GameTime;
    vec2 ScreenSize;
    int MenuBlurRadius;
    int UseRgss;
};

uniform sampler2D Sampler0;

layout(location = 0) in vec2 texCoord0;
layout(location = 1) in vec4 vertexColor;
layout(location = 2) flat in vec2 uuiRotation;
layout(location = 3) flat in float uuiScreenOverlay;
layout(location = 4) in vec2 uuiGuiPos;
layout(location = 5) flat in vec4 uuiMaskWindow;

layout(location = 0) out vec4 fragColor;

#include <minecraft:uui_cursor.glsl>
#include <minecraft:uui_mask.glsl>

void main() {
    if (uuiScreenOverlay > 0.5 && uui_signature()) {
        int state = uui_state(GameTime);
        if (state == 0) {
            vec4 water = uui_water_tile(texCoord0) * vertexColor;
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

    vec4 color = texture(Sampler0, texCoord0) * vertexColor;
    if (color.a == 0.0) {
        discard;
    }
    fragColor = color * ColorModulator;
}
