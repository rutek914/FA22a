#pragma once

#include <string>
using std::string;

class Unique {
    protected:
        string name;
    
    public:
        Unique();
        virtual ~Unique();
        void setName(string p_name);
        void getName() const;
        


};