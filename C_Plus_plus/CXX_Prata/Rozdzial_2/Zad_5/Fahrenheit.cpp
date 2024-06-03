// Copyright 2023 Piotr Rucinski

#include <iostream>

using std::string;
using std::cout;
using std::cin;
using std::endl;

/*void CelToFahr(const float *temp) {
    cout << *temp <<
    " stopni Celsjusza to "
    << *temp * 1.8 + 32.0
    << " stopnie Fahrenheita."
    << endl;
}

int main() {

    float *temp = nullptr;
    temp = new float;
    cout << "Podaj temperature w stopniach Celsjusza:" << endl;
    cin >> *temp;
    CelToFahr(temp);
    delete temp;
    temp = nullptr;
    system("pause");
    cout << "\n";
    return 0;

}   */


void celToFahr(const float &temp) {
    cout << temp <<
    " stopni Celsjusza to "
    << temp * 1.8 + 32.0
    << " stopnie Fahrenheita."
    << endl;
}
int main() {
    float temp;
    cout << "Podaj temperature w stopniach Celsjusza:" << endl;
    cin >> temp;
    celToFahr(temp);
    system("pause");
    cout << "\n";
    return 0;
}
// NOLINT