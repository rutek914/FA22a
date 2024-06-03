#include "exercise.h"
#include <iostream>
#include <memory>

using namespace std;

SharedNumber::SharedNumber() {
    cout << "Utworzono wspoldzielony wskaznik" << endl;
}
void SharedNumber::setNumber(int p_number) {
    number = p_number;
}
void SharedNumber::getNumber() const {
    cout << "Liczba: " << number << endl;
}

int main() {
    shared_ptr<SharedNumber> s_ptr_1 = make_shared<SharedNumber>();
    shared_ptr<SharedNumber> s_ptr_2 = s_ptr_1;

    s_ptr_1->setNumber(3);
    s_ptr_1->getNumber();
    s_ptr_2->getNumber();
    cout << "Ilosc referencji: " << s_ptr_2.use_count();
    cout << "\n";
    return 0;
}