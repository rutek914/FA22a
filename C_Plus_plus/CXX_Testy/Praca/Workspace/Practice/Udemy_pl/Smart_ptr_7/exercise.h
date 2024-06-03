#pragma once
#include <iostream>
#include <memory>

using namespace std;

class UniquePersonalData {
protected:
    string name;
    string surname;
    string tel_number;
    int age;
public:
    void setPersonalData(const string& p_name,
                        const string& p_surname,
                        const string& p_telnumber,
                        int p_age);
    void getPersonalData() const;
};