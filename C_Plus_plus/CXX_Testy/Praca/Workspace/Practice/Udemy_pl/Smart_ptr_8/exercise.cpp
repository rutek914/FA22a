#include <iostream>
#include <memory>
#include "exercise.h"

using namespace std;

SharedPrint::SharedPrint() {
    cout << "Utworzono wspoldzielony wskaznik" << endl;
}

int main() {
    shared_ptr<SharedPrint> s_ptr = make_shared<SharedPrint>();

    cout << "ilosc referencji " << s_ptr.use_count() << endl;

    cout << "\n";
    return 0;
}