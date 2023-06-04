#pragma once
#include <string>
using namespace std;

class Unique {
    protected:
        string name;
        int age;

    public:
        Unique();
        virtual ~Unique();
        void getPersonData() const;
        void setName(const string &p_name);
};

class DerivedUnique : public Unique {
    public:
        void setAge(int p_age);
};