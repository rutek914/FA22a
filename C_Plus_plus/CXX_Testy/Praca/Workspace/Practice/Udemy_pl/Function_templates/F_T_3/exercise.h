#include <iostream>
using namespace std;

template<typename T>
T getBiggerValues(const T& t_value_1, const T& t_value_2) {
    return (t_value_1 > t_value_2) ? t_value_1 : t_value_2;
}