#include <iostream>
#include <memory>
#include "exercise.h"

using namespace std;

void SharedName::setName(const string& p_name) {
    name = p_name;
}
void SharedName::getName() const{
    cout << "Imie: " << name << endl;
}

int main() {
    shared_ptr<SharedName> s_name_1 = make_shared<SharedName>();
    shared_ptr<SharedName> s_name_2 = s_name_1;

    s_name_1->setName("Maksymilian");

    cout << "Ilosc referencji: " << s_name_2.use_count() << endl;
    s_name_2.reset();
    cout << "Ilosc referencji: " << s_name_2.use_count() << endl;

    cout << "Ilosc referencji1: " << s_name_1.use_count() << endl;


    cout << "\n";
    return 0;

}