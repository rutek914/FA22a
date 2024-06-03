#include <iostream>
#include <memory>
#include <string>
#include "exercise.h"

using namespace std;

Unique::Unique() {
    cout << "The memory for a uniquze pointer has been allocated" << endl;
}
Unique::~Unique(){
    cout << "The memory for a unique poiter has been deallocated" << endl;
}
void Unique::setName(string p_name){
    name = p_name;
}
void Unique::getName() const{
    cout << "Name: " << name << endl;
}

int main() {
    unique_ptr<Unique> u_ptr = make_unique<Unique>();
    u_ptr->setName("Jakob");
    u_ptr->getName();
    u_ptr->setName("Amadeus");
    u_ptr->getName();
}