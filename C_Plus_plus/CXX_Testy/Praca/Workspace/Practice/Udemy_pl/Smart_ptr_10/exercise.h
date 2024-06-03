#pragma once
#include <iostream>
#include <memory>

using namespace std;

class SharedName {
protected:
    string name;

public:
    void setName(const string& p_name);
    void getName() const;

};