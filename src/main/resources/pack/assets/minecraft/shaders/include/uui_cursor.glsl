#define UUI_ATLAS 64.0
#define UUI_CELL 16.0
#define UUI_COLS 4.0

#define UUI_SIGNATURE_UV (vec2(63.5, 63.5) / UUI_ATLAS)
#define UUI_SIGNATURE_COLOR (vec4(85.0, 85.0, 73.0, 255.0) / 255.0)
#define UUI_WATER_CELL 8.0
#define UUI_SIGNATURE_TOLERANCE 4.0e-4
#define UUI_DAY_TICKS 24000.0
#define UUI_STATE_STEP 4.0

#define UUI_CURSOR_HALF_PX 8.8000

#define UUI_CURSOR_ANCHOR_PX -0.6000

#define UUI_REFERENCE_HALF_HEIGHT 540.0

#define UUI_REFERENCE_HEIGHT 1080.0

#define UUI_SPRITE_COUNT 8
#define UUI_SPAN_STEP 0.5
#define UUI_SPAN_INDEX_LIMIT 400

vec2 uui_cell_origin(float index) {
    return vec2(mod(index, UUI_COLS), floor(index / UUI_COLS)) * UUI_CELL;
}

bool uui_signature() {
    vec4 stamp = textureLod(Sampler0, UUI_SIGNATURE_UV, 0.0) - UUI_SIGNATURE_COLOR;
    return dot(stamp, stamp) < UUI_SIGNATURE_TOLERANCE;
}

vec4 uui_water_tile(vec2 coord) {
    return textureLod(Sampler0, (uui_cell_origin(UUI_WATER_CELL) + fract(coord) * UUI_CELL) / UUI_ATLAS, 0.0);
}

vec4 uui_sample(vec2 uv) {
    vec2 size = vec2(textureSize(Sampler0, 0));
    vec2 texel = uv * size;
    vec2 footprint = max(fwidth(texel), vec2(1e-5));
    int stepsX = int(clamp(ceil(footprint.x), 1.0, 8.0));
    int stepsY = int(clamp(ceil(footprint.y), 1.0, 8.0));
    vec4 total = vec4(0.0);
    for (int y = 0; y < stepsY; y++) {
        for (int x = 0; x < stepsX; x++) {
            vec2 offset = (vec2(float(x) + 0.5, float(y) + 0.5) / vec2(float(stepsX), float(stepsY)) - 0.5) * footprint;
            vec4 sampled = texture(Sampler0, (texel + offset) / size);
            total += vec4(sampled.rgb * sampled.a, sampled.a);
        }
    }
    total /= float(stepsX * stepsY);
    return vec4(total.rgb / max(total.a, 1e-4), total.a);
}

int uui_state(float clock) {
    float ticks = -clock * UUI_DAY_TICKS;
    if (ticks < UUI_STATE_STEP * 0.5) {
        return 0;
    }
    return int(round(ticks / UUI_STATE_STEP));
}

bool uui_cursor(vec2 rotation, int state, vec2 screenSize, out vec4 result) {
    result = vec4(0.0);

    int sprite = state & (UUI_SPRITE_COUNT - 1);
    int spanIndex = state / UUI_SPRITE_COUNT;
    if (spanIndex <= 0 || spanIndex >= UUI_SPAN_INDEX_LIMIT) {
        return false;
    }

    float yawHalf = float(spanIndex) * UUI_SPAN_STEP;
    float pitchHalf = yawHalf * 0.5;

    float yaw = -64.0 * rotation.x;
    float pitch = 64.0 * rotation.y;

    float hudAspect = (screenSize.y / 9.0 * 16.0) / max(screenSize.x, 1.0);
    vec2 center = vec2(
        clamp(yaw / yawHalf, -1.0, 1.0) * hudAspect,
        -clamp(pitch / pitchHalf, -1.0, 1.0) + UUI_CURSOR_ANCHOR_PX / UUI_REFERENCE_HALF_HEIGHT
    );

    float halfPixels = UUI_CURSOR_HALF_PX * (screenSize.y / UUI_REFERENCE_HEIGHT);
    vec2 halfSize = 2.0 * vec2(halfPixels) / max(screenSize, vec2(1.0));

    vec2 ndc = gl_FragCoord.xy / screenSize * 2.0 - 1.0;
    vec2 local = (ndc - center) / (2.0 * halfSize) + 0.5;

    vec2 uv = (uui_cell_origin(float(sprite)) + clamp(vec2(local.x, 1.0 - local.y), 0.0, 1.0) * UUI_CELL) / UUI_ATLAS;
    vec4 sampled = uui_sample(uv);

    if (clamp(local, 0.0, 1.0) != local || sampled.a <= 0.0) {
        return false;
    }

    result = sampled;
    return true;
}
