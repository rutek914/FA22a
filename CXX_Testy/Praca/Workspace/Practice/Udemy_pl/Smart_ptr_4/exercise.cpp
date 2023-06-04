
#include <iostream>

#include <memory>
#include "exercise.h"

using namespace std;

Unique::Unique() {
    cout << "utworzono unikalny wskaznik" << endl;
}
Unique::~Unique() {
    cout << "zniszczono unikalny wskaznik" << endl;
}

void Unique::getPersonData() const {
    cout
    << "Name: "
    << name << endl
    << "Age: "
    << age << endl;
}
void Unique::setName(const string &p_name) {
    name = p_name;
}
void DerivedUnique::setAge(int p_age) {
    age = p_age;
}

int main() {
    unique_ptr<DerivedUnique> person = make_unique<DerivedUnique>();

    person->setName("Kuba");
    person->setAge(21);
    person->getPersonData();
    //person.reset();
    system("pause");
    return 0;
}
