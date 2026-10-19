#define UUI_BB_PROFILE_SAMPLES 16
#define UUI_BB_PROFILE_BORDER 0.001

float uui_bb_corner_alpha(vec3 corner) {
    int setIndex = int(corner.z + 0.5);
    float position = clamp(corner.y, 0.0, 1.0) * float(UUI_BB_PROFILE_SAMPLES) - 0.5;
    float lowIndex = floor(position);
    float mix0 = position - lowIndex;
    int indexA = int(clamp(lowIndex, 0.0, float(UUI_BB_PROFILE_SAMPLES - 1)));
    int indexB = int(clamp(lowIndex + 1.0, 0.0, float(UUI_BB_PROFILE_SAMPLES - 1)));
    int base = setIndex * UUI_BB_PROFILE_SAMPLES;
    float leftEdge = mix(UUI_BB_MASK_LEFT[base + indexA], UUI_BB_MASK_LEFT[base + indexB], mix0);
    float rightEdge = mix(UUI_BB_MASK_RIGHT[base + indexA], UUI_BB_MASK_RIGHT[base + indexB], mix0);
    float width = max(fwidth(corner.x), 0.00001);
    float leftCoverage = leftEdge <= UUI_BB_PROFILE_BORDER ? 1.0 : clamp(((corner.x - leftEdge) / width) + 0.5, 0.0, 1.0);
    float rightCoverage = rightEdge >= 1.0 - UUI_BB_PROFILE_BORDER ? 1.0 : clamp(((rightEdge - corner.x) / width) + 0.5, 0.0, 1.0);
    return leftCoverage * rightCoverage;
}
