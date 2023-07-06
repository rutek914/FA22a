#include "exercise.h"
#include <iostream>
using namespace std;

int main() {

    cout << getBiggerValues<int>(5,7) << endl;
    cout << getBiggerValues<float>(6.3,9.2) << endl;
    cout << getBiggerValues<char>('A','Z') << endl;

    cout << "\n";
    return 0;
    
}
