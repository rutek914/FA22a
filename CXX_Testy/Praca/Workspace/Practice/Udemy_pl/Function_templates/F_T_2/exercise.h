#pragma once
#include <iostream>
using namespace std;

template<typename T, typename U>
void printValue(const T& t_value, const U& u_value) {
    cout << "given values: [" << t_value << "] [" << u_value << "]" << endl;
}
