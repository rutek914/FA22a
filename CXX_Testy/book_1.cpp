#include <iostream>

using namespace std;

const double pi = 3.1416;

void Area(double promien, double& wynik);
void Area(double promien, double wysokosc, double& wynik);

int main(){
    
double wyn = 0;
const double radius = 1;
const double high = 5;
Area(radius, wyn);
cout << wyn << " kula"<< endl;
Area(radius, high, wyn);
cout << wyn << " walec" << endl;


}

void Area(const double promien, double& wynik){
    wynik = (4*pi*promien*promien*promien)/3;
}
void Area(const double promien,const double wysokosc, double& wynik){
    wynik = pi*promien*promien*wysokosc;
} 