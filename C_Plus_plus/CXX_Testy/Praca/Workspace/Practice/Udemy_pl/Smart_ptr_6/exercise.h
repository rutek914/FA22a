#pragma once
#include <iostream>
#include <memory>

using namespace std;

class UniqueCashMaschine {
protected:
    int cash;

public:
    UniqueCashMaschine();
    void deposit(int p_cash);
    void withdraw(int p_cash);
    void showCash();
    ~UniqueCashMaschine();
};