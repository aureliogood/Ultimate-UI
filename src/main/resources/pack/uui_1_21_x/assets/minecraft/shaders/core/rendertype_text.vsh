#version 150

#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in ivec2 UV2;

uniform sampler2D Sampler2;

out float sphericalVertexDistance;
out float cylindricalVertexDistance;
out vec4 vertexColor;
out vec2 texCoord0;
out float uuiClipDistance;
#moj_import <globals.glsl>
#moj_import <hud.glsl>
#moj_import <minecraft:uui_mask.glsl>
void main() {
    uuiClipDistance = 1.0;
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);
    if (uui_mask_inside(uui_mask_window(ProjMat, GameTime), (ModelViewMat * vec4(Position, 1.0)).xy)) {
        gl_Position = vec4(2.0, 2.0, 2.0, 1.0);
        vertexColor = vec4(0.0);
        texCoord0 = vec2(0.0);
        return;
    }

    sphericalVertexDistance = fog_spherical_distance(Position);
    cylindricalVertexDistance = fog_cylindrical_distance(Position);
    vertexColor = Color * texelFetch(Sampler2, UV2 / 16, 0);
    texCoord0 = UV0;
    if (make_hud()) {
        uuiClipDistance = uui_clip_distance(UV2, Color);
        vertexColor = Color;
        sphericalVertexDistance = -1.0e6;
        cylindricalVertexDistance = -1.0e6;
        return;
    }
}
