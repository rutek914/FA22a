#include <iostream>
#include "exercise.h"
using namespace std;

int main() {
    displayDataFromRange<short>(4,15);
    cout << "|\n";
    displayDataFromRange<char>('E','O');
    cout << "|\n";
    return 0;
}