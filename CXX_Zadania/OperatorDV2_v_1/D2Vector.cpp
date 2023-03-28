#include <iostream>
#include <sstream>
using namespace std;

class D2Vector{
    private:
        double m_x;
        double m_y;
        string VectorInString;
    public:
        D2Vector(double one, double two) : m_x(one), m_y(two){};

        D2Vector& operator ++(){
            ++m_x;
            ++m_y;
            return *this;
        }

        operator const char*(){
            ostringstream formattedVector;
            formattedVector << '(' << m_x << ',' << m_y << ')';
            VectorInString = formattedVector.str();
            return VectorInString.c_str();
        }

};
int main (){
    D2Vector vect(1,2);
    cout << "Wert am Anfang: "<< vect;
    ++vect;
    cout << "Wert nach der Inkrementierung: "<< vect;
    

}