// Copyright 2023 Piotr Rucinski

#include <iostream>

using std::cout;
using std::cin;
using std::endl;

void convert(const unsigned short &hour,  // NOLINT
const unsigned short &minute) {  // NOLINT
    cout
    << "Czas: "
    << hour
    << ":"
    << minute
    << endl;
}

int main() {
    unsigned short hour, minute;  // NOLINT

    cout << "Podaj liczbe godzin: ";
    cin >> hour;
    cout << "Podaj liczbe minut: ";
    cin >> minute;

    convert(hour, minute);

    system("pause");
    cout << "\n";
    return 0;
}  // NOLINT