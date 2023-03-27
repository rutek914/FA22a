#include <iostream>

using namespace std;

enum operacja{
    addi = 1,
    subi, //2
    multi, //3
    divi //4
};

double addition(double x1, double x2);
double subtraktion(double x1, double x2);
double multiplikation(double x1, double x2);
double division(double x1, double x2);

int main(int argc, char* argv[]){
    int choice;

    cout << "Welche mathematische Operation? [1 für add,2 für sub,3 für mult,4 für div]"<<endl;
    cin >> choice;

    double (*wskFunkcji)(double, double);
    wskFunkcji = (choice == addi) ? &addition : (choice==subi) ? &subtraktion: (choice==multi) ? &multiplikation: &division;
    double kupa = (*wskFunkcji)(35.5,67.12);
    cout << "wynik: "<< kupa <<endl;
    cout << "Test daje wskFunkcji "<< wskFunkcji<<endl;
    cout << "Test daje *wskFunkcji "<< *wskFunkcji<< endl;


return 0;
}

double addition(double x1, double x2){
    return x1+x2;
}
double subtraktion(double x1, double x2){
    return x1-x2;
}
double multiplikation(double x1, double x2){
    return x1*x2;
}
double division(double x1, double x2){
    if (x2 != 0){
        return x1/x2;
    }
    return 0;
}