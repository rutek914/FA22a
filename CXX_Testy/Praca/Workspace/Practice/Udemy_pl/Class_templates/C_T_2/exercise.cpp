#include <iostream>
#include "exercise.h"
#include <memory>

using std::cout;
using std::endl;
using std::string;
using std::unique_ptr;
using std::make_unique;

template<typename T>
Print<T>::Print(const T& p_value) {
    cout << "Value: " << p_value << endl;
}

int main() {
    unique_ptr<Print<int>> p1 = make_unique<Print<int>>(16);
    unique_ptr<Print<string>> p2 = make_unique<Print<string>>("C++");

    cout << "\n";
    return 0;
}
