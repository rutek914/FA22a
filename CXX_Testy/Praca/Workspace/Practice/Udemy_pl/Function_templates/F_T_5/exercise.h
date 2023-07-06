#pragma once
#include <iostream>

using namespace std;

template<typename T>
void displayDataFromRange(const T& t_start_value, const T& t_end_value) {
    for(T i = t_start_value; i <= t_end_value; ++i) {
        cout
        << "|"
        << i;
    }
}