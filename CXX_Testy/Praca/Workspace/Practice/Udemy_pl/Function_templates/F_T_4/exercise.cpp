#include "exercise.h"
#include <iostream>

using namespace std;

int main() {

    displayPersonalData<const char*,int>("Jan", "Smith", 34);
    displayPersonalData<const char*,int>("Peter", "Totti", 47);
    
    cout << "\n";
    return 0;
}