#version 330
#extension GL_ARB_separate_shader_objects : require

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    mat4 TextureMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
};
layout(std140) uniform Projection {
    mat4 ProjMat;
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

#include <minecraft:uui_mask.glsl>

layout(location = 0) in vec3 Position;
layout(location = 1) in vec2 UV0;
layout(location = 2) in vec4 Color;

layout(location = 0) out vec2 texCoord0;
layout(location = 1) out vec4 vertexColor;
layout(location = 2) flat out vec2 uuiRotation;
layout(location = 3) flat out float uuiScreenOverlay;
layout(location = 4) out vec2 uuiGuiPos;
layout(location = 5) flat out vec4 uuiMaskWindow;

#define UUI_OVERLAY_ALPHA 0.1
#define UUI_OVERLAY_TOLERANCE vec4(1.0e-4, 1.0e-4, 1.0e-4, 0.02)
#define UUI_UV_CORNER_SHIFT 4.0

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    texCoord0 = UV0;
    vertexColor = Color;
    uuiGuiPos = (ModelViewMat * vec4(Position, 1.0)).xy;
    uuiMaskWindow = uui_mask_window(ProjMat, GameTime);

    vec4 uuiSlack = abs(vec4(abs(Position.xy) - vec2(1.0), Position.z + 0.5, Color.a - UUI_OVERLAY_ALPHA))
        / UUI_OVERLAY_TOLERANCE;
    bool uuiIsOverlay = max(max(uuiSlack.x, uuiSlack.y), max(uuiSlack.z, uuiSlack.w)) < 1.0;
    uuiScreenOverlay = float(uuiIsOverlay);
    uuiRotation = uuiIsOverlay ? UV0 - UUI_UV_CORNER_SHIFT * step(Position.xy, vec2(0.0)) : vec2(0.0);
}
