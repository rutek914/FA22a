#include <iostream>
#include "Vec2D.h"
#include <memory>

using namespace std;

int main() {
    // shared_ptr<Vec2D> u_p = make_shared<Vec2D>(3,7);

    unique_ptr<Vec2D> pp = make_unique<Vec2D>(3,7);

    Vec2D p(1,10);

    cout << p << endl;
    cout << -(*pp) << endl;
    cout << p * 3;
}