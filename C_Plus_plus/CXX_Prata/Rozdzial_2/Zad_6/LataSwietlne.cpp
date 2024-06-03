// Copyright 2023 Piotr Rucinski

#include <iostream>

using std::cout;
using std::endl;
using std::cin;

/*void lataToAU(double &lata) {
    lata*=63240;
}

int main() {
    double lata;

    cout
    << "Podaj liczbe lat swietlnych: "
    << endl;

    cin >> lata;
    double lataStart = lata;
    lataToAU(lata);

    cout
    << lataStart
    << " lat swietlnych = "
    << lata
    << " jednostek astronomicznych."
    << endl;

    system("pause");
    cout << "\n";
    return 0;
} */

void lataToAU(double *lata) {
    *lata*=63240;
}

int main() {
    double lata;
    double *wskaznik = nullptr;

    cout
    << "Podaj liczbe lat swietlnych: "
    << endl;

    cin >> lata;
    wskaznik = &lata;
    double lataStart = lata;
    lataToAU(wskaznik);  // lub lataToAU(&lata);

    cout
    << lataStart
    << " lat swietlnych = "
    << lata
    << " jednostek astronomicznych."
    << endl;

    system("pause");
    cout << "\n";
    return 0;
}  // NOLINT