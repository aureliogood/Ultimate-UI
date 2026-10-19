#version 150

in vec3 Position;
in vec4 Color;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;
uniform float GameTime;

out vec4 vertexColor;
out vec2 uuiGuiPos;
flat out vec4 uuiMaskWindow;

#moj_import <uui_mask.glsl>

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    vertexColor = Color;
    uuiGuiPos = (ModelViewMat * vec4(Position, 1.0)).xy;
    uuiMaskWindow = uui_mask_window(ProjMat, GameTime);
    if (uui_mask_screen_dim(uuiMaskWindow, ProjMat, uuiGuiPos, Color)) {
        gl_Position = vec4(2.0, 2.0, 2.0, 1.0);
    }
}
