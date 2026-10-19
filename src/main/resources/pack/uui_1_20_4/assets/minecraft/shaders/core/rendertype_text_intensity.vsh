#version 150

#moj_import <fog.glsl>
#moj_import <hud.glsl>

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in ivec2 UV2;

uniform sampler2D Sampler2;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;
uniform vec2 ScreenSize;
uniform mat3 IViewRotMat;
uniform int FogShape;

out float vertexDistance;
out vec4 vertexColor;
out vec2 texCoord0;
out float uuiClipDistance;

void main() {
    uuiClipDistance = 1.0;
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    vertexDistance = fog_distance(ModelViewMat, IViewRotMat * Position, FogShape);
    vertexColor = Color * texelFetch(Sampler2, UV2 / 16, 0);
    texCoord0 = UV0;

    if (make_hud(Position, ScreenSize, ModelViewMat)) {
        uuiClipDistance = uui_clip_distance(UV2, Color);
        vertexColor = Color;
        vertexDistance = -1.0e6;
    }
}
