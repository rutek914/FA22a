#include <iostream>

using namespace std;

int main(int argc, char* argv[]){
    int x = 23;
    int* p = &x;
    int** pp = &p;

    cout << " x:" << x << endl; // 23
    cout << " p:" << p << endl; // adres von 23 yy
    cout << " *p:" << *p << endl; // 23
    cout << " pp: " << pp << endl; // adres von ptrhh
    cout << "*pp:" << *pp << endl; // wartosc pointer adres von 23 yy
    cout << "**pp:" << **pp << endl; // 23





return 0;

}