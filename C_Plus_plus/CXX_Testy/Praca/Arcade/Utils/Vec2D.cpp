#include "Vec2D.h"
#include "Utils.h"
#include <iostream>
#include <cassert>
#include <cmath>
using namespace std;

const Vec2D Vec2D::Zero;

Vec2D::Vec2D() : Vec2D(0,0){}
Vec2D::Vec2D(float x, float y) : mX(x), mY(y){}

bool Vec2D::operator==(const Vec2D& vec2) const {
    return isEqual(mX, vec2.mX) && isEqual(mY, vec2.mY);
}
bool Vec2D::operator!=(const Vec2D& vec2) const {
    return !(*this == vec2);
}

Vec2D Vec2D::operator-() const {
    return Vec2D(-mX, -mY);
}
Vec2D Vec2D::operator*(float scale) const
{
    return Vec2D(scale * mX, scale * mY);
}
Vec2D Vec2D::operator/(float scale) const
{
    assert(fabsf(scale) > EPSILON);
    return Vec2D(mX/scale, mY/scale);
    
}
Vec2D& Vec2D::operator*=(float scale)
{
    *this = *this * scale;
    return *this;
}
Vec2D& Vec2D::operator /=(float scale)
{
    assert(fabsf(scale) > EPSILON);
    *this = *this / scale;
    return *this;
}


ostream& operator<<(ostream& consoleOut, const Vec2D& vec) {
    cout << "X: " <<vec.mX<< ", Y: "<<vec.mY<<endl;
    return consoleOut;
}
// -------------------------------------------------
Vec2D operator*(float scalar, Vec2D& vec)
{
    return vec * scalar;
}
//----------------------------------------------------------------------
Vec2D Vec2D::operator+(const Vec2D& vec) const
{
    return Vec2D(mX + vec.mX, mY + vec.mY);
}
//--------------------------------------------------------------------
Vec2D Vec2D::operator-(const Vec2D& vec) const
{
    return Vec2D(mX-vec.mX, mY - vec.mY);
}
//----------------------------------------------------------------
Vec2D& Vec2D::operator +=(const Vec2D& vec)
{
    *this = *this + vec;
    return *this;
}
//-----------------------------------------------------------------
Vec2D& Vec2D::operator -=(const Vec2D& vec)
{
    *this = *this - vec;
    return *this;
}
//-----------------------------------------------------------------------
float Vec2D::Mag() const
{
    return sqrt(Mag2());
}
//------------------------------------------------------------------
float Vec2D::Mag2() const
{
    return mX*mX+mY*mY;
}
//---------------------------------------------------------------------
Vec2D Vec2D::getUnitVec() const
{
    float mag = Mag();
    if(mag > EPSILON)
    {
        return *this/mag;
    }
    return Vec2D::Zero;
}
//----------------------------------------------------------------------
Vec2D& Vec2D::normalize() // make our current vector unit one
{
    float mag = Mag();
    if(mag > EPSILON)
    {
        *this /= mag;
    }
    return *this;
}

//----------------------------------------------
float Vec2D::Distance(const Vec2D& vec) const
{
    return (vec-*this).Mag();
}

//--------------------------------------------------
float Vec2D::Dot(const Vec2D& vec) const
{
    return mX*vec.mX+mY*vec.mY;
}