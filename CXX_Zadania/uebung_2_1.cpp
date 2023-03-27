#include <iostream>

using namespace std;



void zerujLiczby(int* wskLiczba1, int* wskLiczba2){
    *wskLiczba1 = 0;
    *wskLiczba2 = 0;
    cout << "wewnatrz funkcji " << *wskLiczba1 << " " << *wskLiczba2 << endl;
}

int main(int argc, char* argv[]){
    int liczba1 = 10;
    int liczba2 = 20;
    int* wskLiczba1 = &liczba1;
    int* wskLiczba2 = &liczba2;
    cout << "wartosc liczby ze wskaznika " << *wskLiczba1 << " "<< *wskLiczba2<<endl;

    zerujLiczby(wskLiczba1, wskLiczba2);
    cout << "Liczby po funkcji "<<liczba1<<" "<<liczba2<<endl;
    return 0;




}