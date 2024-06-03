#pragma once

using namespace std;

template<typename T>
class Print {

protected:
    T value;

public:
    void setValue(const T& p_value);
    void displayValue();

};