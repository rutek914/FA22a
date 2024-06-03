// Copyright 2023 Piotr Rucinski

#include <iostream>

using std::string;
using std::cout;
using std::cin;
using std::endl;

int main() {
    int wiek;

    cout << "Podaj swoj wiek: " << endl;
    cin >> wiek;
    cout << "Twoj wiek w miesiacach wynosi: " << wiek*12 << endl;

    system("pause");
    cout << "\n";
    return 0;
}