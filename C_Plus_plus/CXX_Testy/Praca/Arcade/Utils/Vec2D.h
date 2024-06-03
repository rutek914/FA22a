#pragma once
#include <iostream>
using namespace std;

class Vec2D {

    private:

    float mX, mY;

    public:

    static const Vec2D Zero;
    Vec2D();
    Vec2D(float x, float y);

    inline void setX(float x) {mX=x;};
    inline void setY(float y) {mY=y;};
    inline float getX() const {return mX;};
    inline float getY() const {return mY;};

    Vec2D operator-() const;
    Vec2D operator*(float scale) const;
    Vec2D operator/(float scale) const;
    Vec2D& operator*=(float scane);
    Vec2D& operator /=(float scale);
    Vec2D operator+(const Vec2D& vec) const;
    Vec2D operator-(const Vec2D& vec) const;
    Vec2D& operator +=(const Vec2D& vec);
    Vec2D& operator -=(const Vec2D& vec);

    friend ostream& operator<<(ostream& consoleOut, const Vec2D& vec);
    friend Vec2D operator*(float scalar, Vec2D& vec);

    bool operator==(const Vec2D& vec2) const;
    bool operator!=(const Vec2D& vec2) const;
    float Mag() const;
    float Mag2() const;
    Vec2D getUnitVec() const;
    Vec2D& normalize(); // make our current vector unit one
    float Distance(const Vec2D& vec) const;
    float Dot(const Vec2D& vec) const;
};
