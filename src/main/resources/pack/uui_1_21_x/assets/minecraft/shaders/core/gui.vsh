#version 330

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>
#moj_import <minecraft:globals.glsl>
#moj_import <minecraft:uui_mask.glsl>

in vec3 Position;
in vec4 Color;

out vec4 vertexColor;
out vec2 uuiGuiPos;
flat out vec4 uuiMaskWindow;

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    vertexColor = Color;
    uuiGuiPos = (ModelViewMat * vec4(Position, 1.0)).xy;
    uuiMaskWindow = uui_mask_window(ProjMat, GameTime);
    if (uui_mask_screen_dim(uuiMaskWindow, ProjMat, uuiGuiPos, Color)) {
        gl_Position = vec4(2.0, 2.0, 2.0, 1.0);
    }
}
