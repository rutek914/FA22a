#include <iostream>
using namespace std;

enum Ausbildungsberuf{
    FIAN = 1,
    FISY
};

class Azubi{
private:
    const char* m_name, *m_vorname, *m_fachabteilung;
    const int m_persoNr;
    int m_lehrjahr;
    Ausbildungsberuf beruf;
public:
    Azubi(const char* name, const char* vorname, const char* fachabteilung, const int persoNr, int lehrjahr, Ausbildungsberuf beruf)
    : m_name(name), m_vorname(vorname), m_fachabteilung(fachabteilung), m_persoNr(persoNr), beruf(beruf){
        this->m_lehrjahr = lehrjahr;
    }
    ~Azubi(){
        //delete[] m_name;
        //delete[] m_vorname;
        //delete[] m_fachabteilung;
    }

    void printStudent() {
        cout << "Vorname: " << m_vorname << endl;
        cout << "Name: " << m_name << endl;
        cout << "Personalnummer: " << m_persoNr << endl;
        cout << "Fachabteilung: " << m_fachabteilung << endl;
        cout << "Lehrjahr: " << m_lehrjahr << endl;
        cout << "Ausbildungsberuf: ";
        switch(beruf) {
            case Ausbildungsberuf::FIAN:
                cout << "FIAN";
                break;
            case Ausbildungsberuf::FISY:
                cout << "FISY";
                break;
        }
        cout << endl;
    }

};

int main() {
    Azubi azubi("Potter", "Harry", "CT", 914, 1, FIAN);
    azubi.printStudent();
    return 0;
}
