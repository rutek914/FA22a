#pragma once
#include <iostream>

using namespace std;

template<typename T, typename U>
void displayPersonalData(const T& t_name,const T& t_surname,const U& u_age) {
    cout 
    << "Name: "
    << t_name
    << "\nSurname: "
    << t_surname
    << "\nAge: "
    << u_age << endl;
}