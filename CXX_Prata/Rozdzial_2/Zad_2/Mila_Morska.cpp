// Copyright 2023 Piotr Rucinski

#include <iostream>
using std::cout;
using std::cin;
using std::endl;
using std::string;

int main() {
    int mila;

    cout << "Podaj odleglosc w milach morskich:" << endl;
    cin >> mila;

    cout << mila << " Mil morskich w metrach to: ";
    mila *= 1852;
    cout << mila << " metry." << endl;

    system("pause");
    cout<< "\n";
    return 0;
}  // NOLINT