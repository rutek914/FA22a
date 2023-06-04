#include <iostream>
#include <memory>
#include "exercise.h"


using namespace std;

void Unique::getNumber() const {
    cout << number;
}

void Unique::setNumber(int p_number) {
    number = p_number;
}

int main() {

        //unique_ptr<Unique> u_ptr(new Unique);
        unique_ptr<Unique> u_ptr = make_unique<Unique>();
        u_ptr->setNumber(19);
        u_ptr->getNumber();
        cout << endl;

}