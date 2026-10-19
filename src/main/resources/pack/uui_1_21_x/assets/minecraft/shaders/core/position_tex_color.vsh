#version 330

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>
#moj_import <minecraft:globals.glsl>
#moj_import <minecraft:uui_mask.glsl>

in vec3 Position;
in vec2 UV0;
in vec4 Color;

out vec2 texCoord0;
out vec4 vertexColor;
flat out vec2 uuiRotation;
flat out float uuiScreenOverlay;
out vec2 uuiGuiPos;
flat out vec4 uuiMaskWindow;

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
