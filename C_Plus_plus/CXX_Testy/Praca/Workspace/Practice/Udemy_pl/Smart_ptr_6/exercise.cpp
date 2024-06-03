#include <iostream>
#include <memory>
#include "exercise.h"

using namespace std;

UniqueCashMaschine::UniqueCashMaschine() {
    cash = 0;
    cout << "Operacja otwarta\n" << endl;
}
UniqueCashMaschine::~UniqueCashMaschine() {
    cout << "Operacja zamknieta" << endl;
}
void UniqueCashMaschine::deposit(int p_cash) {
    cash += p_cash;
    cout << "Wplacono: " << p_cash << endl;
}
void UniqueCashMaschine::withdraw(int p_cash) {
    cash -= p_cash;
    cout << "Wyplacono: " << p_cash << endl;
}
void UniqueCashMaschine::showCash() {
    cout << "Stan konta: " << cash << endl;
}

int main() {
    unique_ptr<UniqueCashMaschine> account_1 = make_unique<UniqueCashMaschine>();

    account_1->deposit(3000);
    account_1->showCash();
    account_1->withdraw(1500);
    account_1->showCash();
    account_1->deposit(750);
    account_1->showCash();

    cout << "\n";
    return 0;
}