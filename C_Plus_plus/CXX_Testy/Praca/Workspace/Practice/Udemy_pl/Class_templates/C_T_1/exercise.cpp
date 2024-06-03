#include "exercise.h"
#include <memory>
#include <iostream>
using namespace std;

template<typename T>
void Print<T>::setValue(const T& p_value) {
    value = p_value;
}
template<typename T>
void Print<T>::displayValue() {
    cout << "Given value: " << value << endl;
}

int main() {

    unique_ptr<Print<int>> p1 = make_unique<Print<int>>();
    unique_ptr<Print<string>> p2 = make_unique<Print<string>>();

    p1->setValue(15);
    p1->displayValue();
    p2->setValue("Future");
    p2->displayValue();

    cout << "\n";
    return 0;
}