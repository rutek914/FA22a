#include "Vec2D.h"
#include "Utils.h"
#include <iostream>
using namespace std;

Vec2D::Vec2D() : Vec2D(0,0){}
Vec2D::Vec2D(float x, float y) : mX(x), mY(y){}

bool Vec2D::operator==(const Vec2D& vec2) const {
    return isEqual(mX, vec2.mX) && isEqual(mY, vec2.mY);
}
bool Vec2D::operator!=(const Vec2D& vec2) const {
    return !(*this == vec2);
}

Vec2D Vec2d::operator-() const {
    return Vec2D(-mX, -mY);
}

ostream& operator<<(ostream& consoleOut, const Vec2D& vec) {
    cout << "X: " <<vec.mX<< ", Y: "<<vec.mY<<endl;
    return consoleOut;
}
int main() {
    Vec2D b;
    cout << b<< endl;
}