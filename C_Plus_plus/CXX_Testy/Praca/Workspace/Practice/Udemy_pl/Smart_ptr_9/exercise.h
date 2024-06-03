#pragma once
#include <iostream>
#include <memory>

using namespace std;

class SharedNumber {
protected:
    int number;

public:
    SharedNumber();
    void setNumber(int p_number);
    void getNumber() const;

};