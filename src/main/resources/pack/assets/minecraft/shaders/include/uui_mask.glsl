#define UUI_MASK_STATE_MIN 3100.0
#define UUI_MASK_STATE_MAX 6000.0
#define UUI_MASK_DAY_TICKS 24000.0
#define UUI_MASK_STATE_STEP 4.0
#define UUI_MASK_WINDOW vec2(176.0, 166.0)
#define UUI_MASK_BACKDROP_RGB (16.0 / 255.0)
#define UUI_MASK_BACKDROP_TOLERANCE (0.75 / 255.0)
#define UUI_MASK_BACKDROP_ALPHA_MIN 0.74
#define UUI_MASK_BACKDROP_ALPHA_MAX 0.83

bool uui_mask_active(float clock) {
    float state = -clock * UUI_MASK_DAY_TICKS / UUI_MASK_STATE_STEP;
    return state > UUI_MASK_STATE_MIN && state < UUI_MASK_STATE_MAX;
}

bool uui_mask_gui_projection(mat4 proj) {
    return abs(proj[2][3]) < 1.0e-6 && abs(proj[3][3] - 1.0) < 1.0e-4 && proj[0][0] > 0.0 && proj[1][1] < 0.0;
}

vec4 uui_mask_window(mat4 proj, float clock) {
    if (!uui_mask_active(clock) || !uui_mask_gui_projection(proj)) {
        return vec4(0.0);
    }
    vec2 gui = floor(vec2(2.0 / proj[0][0], -2.0 / proj[1][1]) + 0.5);
    vec2 origin = floor((gui - UUI_MASK_WINDOW) * 0.5 + 1.0e-3);
    return vec4(origin, origin + UUI_MASK_WINDOW);
}

bool uui_mask_inside(vec4 window, vec2 guiPos) {
    return window.z > window.x
        && guiPos.x >= window.x && guiPos.y >= window.y
        && guiPos.x <= window.z && guiPos.y <= window.w;
}

bool uui_mask_backdrop(vec4 color) {
    return all(lessThan(abs(color.rgb - vec3(UUI_MASK_BACKDROP_RGB)), vec3(UUI_MASK_BACKDROP_TOLERANCE)))
        && color.a > UUI_MASK_BACKDROP_ALPHA_MIN && color.a < UUI_MASK_BACKDROP_ALPHA_MAX;
}

#define UUI_MASK_DIM_MAX_RGB 0.3
#define UUI_MASK_EDGE_TOLERANCE 0.5

bool uui_mask_screen_dim(vec4 window, mat4 proj, vec2 guiPos, vec4 color) {
    if (window.z <= window.x) {
        return false;
    }
    vec2 gui = floor(vec2(2.0 / proj[0][0], -2.0 / proj[1][1]) + 0.5);
    bool edgeX = abs(guiPos.x) < UUI_MASK_EDGE_TOLERANCE || abs(guiPos.x - gui.x) < UUI_MASK_EDGE_TOLERANCE;
    bool edgeY = abs(guiPos.y) < UUI_MASK_EDGE_TOLERANCE || abs(guiPos.y - gui.y) < UUI_MASK_EDGE_TOLERANCE;
    return edgeX && edgeY
        && max(max(color.r, color.g), color.b) < UUI_MASK_DIM_MAX_RGB
        && color.a > 0.0 && color.a < 1.0;
}
