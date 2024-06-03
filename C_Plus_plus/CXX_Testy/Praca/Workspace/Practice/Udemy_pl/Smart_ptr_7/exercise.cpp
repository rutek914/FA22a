#include <iostream>
#include <memory>
#include "exercise.h"

using namespace std;

void UniquePersonalData::setPersonalData(const string& p_name,
                                        const string& p_surname,
                                        const string& p_telnumber,
                                        int p_age){
    name = p_name;
    surname = p_surname;
    tel_number = p_telnumber;
    age = p_age;
}

void UniquePersonalData::getPersonalData() const{
    cout
    << "\n<<Danke osobowe>>\n"
    << "Imie: " << name
    << "\nNazwisko: " << surname
    << "\nNumer telefonu: " << tel_number
    << "\nWiek: " << age << endl;
}

int main() {
    
    unique_ptr<UniquePersonalData> person = make_unique<UniquePersonalData>();
    person->setPersonalData("Jan", "Kowalski", "123456789", 34);
    person->getPersonalData();
    person->setPersonalData("Piotr", "Nowak", "987654321", 43);
    person->getPersonalData();

    cout << "\n";
    return 0;
}