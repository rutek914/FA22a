#pragma once
#include <iostream>
using namespace std;

class Vec2D {

    private:

    float mX, mY;

    public:

    Vec2D();
    Vec2D(float x, float y);

    inline void setX(float x) {mX=x;};
    inline void setY(float y) {mY=y;};
    inline float getX() const {return mX;};
    inline float getY() const {return mY;};

    Vec2D operator-() const;

    friend ostream& operator<<(ostream& consoleOut, const Vec2D& vec);

    bool operator==(const Vec2D& vec2) const;
    bool operator!=(const Vec2D& vec2) const;
};
