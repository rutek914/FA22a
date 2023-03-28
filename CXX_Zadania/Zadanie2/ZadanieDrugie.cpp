#include <iostream>
using namespace std;

enum Ausbildungsberuf{
    FIAN = 1,
    FISY
};

class Azubi{
private:
    const char* m_name, *m_vorname, *m_fachabteilung;
    mutable int m_persoNr;
    int m_lehrjahr;
    Ausbildungsberuf beruf;
public:
    Azubi() = default;
    Azubi(const char* name, const char* vorname, const char* fachabteilung, int persoNr, int lehrjahr, Ausbildungsberuf beruf)
    : m_name(name), m_vorname(vorname), m_fachabteilung(fachabteilung), m_persoNr(persoNr), beruf(beruf){
        this->m_lehrjahr = lehrjahr;
    }
    Azubi(const Azubi& azCopy){
        cout << "copy constructor here!"<< endl;
        this->m_name = azCopy.m_name;
        this->m_vorname = azCopy.m_vorname;
        this->m_fachabteilung = azCopy.m_fachabteilung;
        this->m_persoNr = azCopy.m_persoNr;
        this->m_lehrjahr = azCopy.m_lehrjahr;
        this->beruf = azCopy.beruf;
    }

    ~Azubi(){
        //delete[] m_name;
        //delete[] m_vorname;
        //delete[] m_fachabteilung;
    }

    void printStudent() const {
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
    Azubi azubi("Potter", "Harry", "HT", 914, 1, FIAN);
    azubi.printStudent();
    Azubi azubi2(azubi);
    azubi2.printStudent();
    return 0;
}
