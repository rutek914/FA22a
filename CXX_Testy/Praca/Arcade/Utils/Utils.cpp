#include "Utils.h"
#include <cmath>

static const float EPSILON = 0.0001f;

bool isEqual(float x, float y) {
    return fabsf(x - y) < EPSILON;
}

bool isGreaterThanOrEqual(float x, float y) {
    return x > y || isEqual(x,y);
}

bool isLessThanOrEqual(float x, float y) {
    return x < y || isEqual(x,y);
}