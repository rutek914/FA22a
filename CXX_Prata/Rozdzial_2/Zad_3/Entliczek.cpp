// Copyright 2023 Piotr Rucinski

#include <cstdio>
#include <iostream>

using std::string;
using std::cout;
using std::endl;

void printArray(const char* array[], int size) {
    for (int i = 0; i < size; ++i) {
        printf("%s", array[i]);
    }
    cout << endl;
}

void printString() {
    cout << "Entliczek pentliczek" << endl;
}

void printChar(const char* text) {
    cout << text << endl;
}

void printDynamic() {
    char* dynamicString = new char[18];
    dynamicString[0] = 'C';
    dynamicString[1] = 'z';
    dynamicString[2] = 'e';
    dynamicString[3] = 'r';
    dynamicString[4] = 'w';
    dynamicString[5] = 'o';
    dynamicString[6] = 'n';
    dynamicString[7] = 'y';
    dynamicString[8] = ' ';
    dynamicString[9] = 's';
    dynamicString[10] = 't';
    dynamicString[11] = 'o';
    dynamicString[12] = 'l';
    dynamicString[13] = 'i';
    dynamicString[14] = 'c';
    dynamicString[15] = 'z';
    dynamicString[16] = 'e';
    dynamicString[17] = 'k';
    dynamicString[18] = '\0';

    cout << dynamicString <<endl;
    delete[] dynamicString;

    


}


int main() {
    const char* array[1] = {"Entliczek pentliczek"};
    printArray(array, 1);
    printString();
    const char* arrayDwa = "Czerwony stoliczek";
    printChar(arrayDwa);
    printDynamic();
    system("pause");
    cout << "\n";
    return 0;
}  // NOLINT