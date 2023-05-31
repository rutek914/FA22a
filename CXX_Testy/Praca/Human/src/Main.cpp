// Copyright 2023 Piotr Rucinski

#include "../include/Person.h"
#include <vector>
#include <iostream>

using std::endl;
using std::cout;
using std::cin;
using std::string;
int main() {

    Person *azubi = new Person("Piotr", 28, "piotr@gmail.com", 0176111111);
    Person *zidane = new Person("Zinedine", 50, "zizou@hotmail.com", 914914914);
    Person *hendrix = new Person("Jimi", 27, "none", 123456);

    vector<Person*> leute;
    leute.push_back(azubi);
    leute.push_back(zidane);
    leute.push_back(hendrix);

    for(auto it = leute.begin(); it! = people.end(); ++it) {
        Person *person = *it;
        cout << "Name: " << person->getName() << endl;
        cout << "Alter: " << person->getAge() << endl;
        cout << "Email: " << person->getEmail() << endl;
        cout << "Tel.nr: " << person->getPhoneNumber() << endl;
    }

    delete azubi;
    delete zidane;
    delete hendrix;
    system("pause");
    cout << "\n";
    return 0;

}
