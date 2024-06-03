#include <iostream>
#include "./Utils/Vec2D.h"
#include <memory>

using namespace std;

int main() {
    // shared_ptr<Vec2D> u_p = make_shared<Vec2D>(3,7);

    unique_ptr<Vec2D> pp = make_unique<Vec2D>(3,7);

    cout << -(*pp) << endl;

}