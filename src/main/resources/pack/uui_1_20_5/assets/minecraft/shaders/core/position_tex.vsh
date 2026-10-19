#version 150

in vec3 Position;
in vec2 UV0;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;
uniform float GameTime;

out vec2 texCoord0;
flat out vec2 uuiRotation;
flat out float uuiScreenOverlay;
out vec2 uuiGuiPos;
flat out vec4 uuiMaskWindow;

#moj_import <uui_mask.glsl>

#define UUI_OVERLAY_TOLERANCE vec3(1.0e-4)
#define UUI_UV_CORNER_SHIFT 4.0

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    texCoord0 = UV0;
    uuiGuiPos = (ModelViewMat * vec4(Position, 1.0)).xy;
    uuiMaskWindow = uui_mask_window(ProjMat, GameTime);

    vec3 uuiSlack = abs(vec3(abs(Position.xy) - vec2(1.0), Position.z + 0.5)) / UUI_OVERLAY_TOLERANCE;
    bool uuiIsOverlay = max(uuiSlack.x, max(uuiSlack.y, uuiSlack.z)) < 1.0;
    uuiScreenOverlay = float(uuiIsOverlay);
    uuiRotation = uuiIsOverlay ? UV0 - UUI_UV_CORNER_SHIFT * step(Position.xy, vec2(0.0)) : vec2(0.0);
}
