#include "exercise.h"
#include <iostream>
#include <memory>
using namespace std;


template<typename T, typename U>
Print<T,U>::Print(const T& p_t_value, const U& p_u_value) {
    cout << "Object: [" << p_t_value << ", " << p_u_value << "]" << endl;
}

int main() {
    unique_ptr<Print<int,double>> p1 = make_unique<Print<int,double>>(1, 9.6);
    unique_ptr<Print<int,string>> p2 = make_unique<Print<int,string>>(2, "C++");
    p1 = make_unique<Print<int,double>>(3, 15.22);

    cout <<"\n";
    return 0;
}