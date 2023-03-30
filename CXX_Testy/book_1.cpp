#include <iostream>

using namespace std;

const double pi = 3.1416;

void Area(double Radius, double& wynik);

int main(){
    
double Radius = 5;

double poleKola = 0;
Area(Radius, poleKola);
cout<< poleKola<<endl;


}

void Area(double Radius, double& wynik){
    wynik = pi*Radius*Radius;
}