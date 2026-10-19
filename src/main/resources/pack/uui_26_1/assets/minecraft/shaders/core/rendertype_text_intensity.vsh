#version 330

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in ivec2 UV2;

#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>
#moj_import <minecraft:sample_lightmap.glsl>
#moj_import <minecraft:globals.glsl>
#moj_import <hud.glsl>

uniform sampler2D Sampler2;

out float sphericalVertexDistance;
out float cylindricalVertexDistance;
out vec4 vertexColor;
out vec2 texCoord0;
out float uuiClipDistance;

void main() {
    uuiClipDistance = 1.0;
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    sphericalVertexDistance = fog_spherical_distance(Position);
    cylindricalVertexDistance = fog_cylindrical_distance(Position);
    vertexColor = Color * sample_lightmap(Sampler2, UV2);
    texCoord0 = UV0;

    if (make_hud()) {
        uuiClipDistance = uui_clip_distance(UV2, Color);
        vertexColor = Color;
        sphericalVertexDistance = -1.0e6;
        cylindricalVertexDistance = -1.0e6;
        return;
    }
}