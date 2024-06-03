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

      friend ostream& operator<<(ostream&, const D2Vector&);

};

    ostream& operator<<(ostream& os, const D2Vector& formattedVect){
        os << '(' << formattedVect.m_x << ',' << formattedVect.m_y << ')';
        return os;
    }

int main (){
    D2Vector vect(1,2);
    cout << "Wert am Anfang: "<< vect;
    ++vect;
    cout << "Wert nach der Inkrementierung: "<< vect;
    

}