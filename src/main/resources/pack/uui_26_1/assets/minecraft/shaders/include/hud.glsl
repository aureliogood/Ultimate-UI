#define X 1
#define Y 1
#define refRes vec2(1920.0, 1080.0)

#define UUI_PART_BAND 1000000.0
#define UUI_PART_MAX 5

int uuiPartId = 0;

int uui_part_id(float y) {
    if (y > -(UUI_PART_BAND * 0.5)) {
        return 0;
    }
    int part = int(floor((-y) / UUI_PART_BAND + 0.5));
    if (part < 1 || part > UUI_PART_MAX) {
        return 0;
    }
    return part;
}

#define UUI_CLIP_BAND 16384.0

int uuiClipBand = 0;
vec2 uuiHudPos = vec2(0.0);

int uui_clip_band(float x) {
    return int(floor(abs(x) / UUI_CLIP_BAND + 0.5));
}

float uui_clip_distance(ivec2 light, vec4 color) {
    if (uuiClipBand <= 0) {
        return 1.0;
    }
    int low = ((light.x >> 4) & 15) | (((light.y >> 4) & 15) << 4);
    int alpha = int(color.a * 255.0 + 0.5);
    int red = int(color.r * 255.0 + 0.5);
    int green = int(color.g * 255.0 + 0.5);
    int payload = low | ((alpha & 3) << 8) | ((red & 1) << 10) | ((green & 1) << 11);
    int axis = (uuiClipBand - 1) & 1;
    int side = (payload >> 11) & 1;
    float line = float(payload & 2047);
    vec2 center = refRes * 0.5;
    if (axis == 0) {
        if (side == 0) {
            return (center.y - line) - uuiHudPos.y;
        }
        return uuiHudPos.y - (center.y - line);
    }
    if (side == 0) {
        return uuiHudPos.x - (line - center.x);
    }
    return (line - center.x) - uuiHudPos.x;
}

float uui_clip_line_distance(int axis, int payload) {
    int side = (payload >> 11) & 1;
    float line = float(payload & 2047);
    vec2 center = refRes * 0.5;
    if (axis == 0) {
        if (side == 0) {
            return (center.y - line) - uuiHudPos.y;
        }
        return uuiHudPos.y - (center.y - line);
    }
    if (side == 0) {
        return uuiHudPos.x - (line - center.x);
    }
    return (line - center.x) - uuiHudPos.x;
}

float uui_item_clip_distance(ivec2 light) {
    if (uuiClipBand <= 0) {
        return 1.0;
    }
    int code = uuiClipBand - 1;
    int low = ((light.x >> 4) & 15) | (((light.y >> 4) & 15) << 4);
    int line = ((code >> 1) << 7) | (low & 127);
    int side = (low >> 7) & 1;
    return uui_clip_line_distance(code & 1, (side << 11) | line);
}

bool is_hud(vec3 Position) {
    return (Position.y < -1000.0);
}

bool make_hud() {
    if (is_hud(Position)) {
        vec3 raw = Position;
        uuiPartId = uui_part_id(raw.y);
        raw.y += float(uuiPartId) * UUI_PART_BAND;

        uuiClipBand = uui_clip_band(raw.x);
        raw.x -= sign(raw.x) * float(uuiClipBand) * UUI_CLIP_BAND;

        vec3 pos = raw + vec3(0.0, 15000.0, 0.0);
        pos.x *= -1.0;
        float hudX = pos.x;
        float offset = 0.0;
        if (raw.y < -20000.0) {
            if (raw.y < -40000.0) {
                pos.y += 20000.0;
                offset = 1.0 - (ScreenSize.y / 9.0 * 16.0) / ScreenSize.x;
            } else if (raw.y < -30000.0) {
                pos.y += 10000.0;
            } else {
                offset = -1.0 + (ScreenSize.y / 9.0 * 16.0) / ScreenSize.x;
            }
            pos.y += 10000.0;
            pos.x *= (ScreenSize.y / 9.0 * 16.0) / ScreenSize.x;
        }

        uuiHudPos = vec2(hudX, pos.y);
        pos.xy /= refRes * vec2(X, Y) / 2.0;
        pos.x += offset;

        pos.z /= 1000000.0;
        gl_Position = vec4(pos, 1.0);
        return true;
    }
    return false;
}
