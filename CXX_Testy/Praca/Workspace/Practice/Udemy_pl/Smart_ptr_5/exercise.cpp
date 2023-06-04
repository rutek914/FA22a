#include <iostream>
#include <memory>
#include "exercise.h"

using namespace std;

void Unique::setValues(int p_x, int p_y) {
    x = p_x;
    y = p_y;
}
void Unique::displaySumVectors(unique_ptr<Unique>& ptr_u, unique_ptr<Unique>& ptr_v) {
    x = ptr_u->x + ptr_v->x;
    y = ptr_u->y + ptr_v->y;
    cout
    << "Powstaly wektor: [" 
    << x << ',' << y << ']' << endl;
}

int main() {
    unique_ptr<Unique> vector_u = make_unique<Unique>();
    unique_ptr<Unique> vector_v = make_unique<Unique>();
    unique_ptr<Unique> vector_x = make_unique<Unique>();

    vector_u->setValues(4,6);
    vector_v->setValues(2,3);
    vector_x->displaySumVectors(vector_u,vector_v);

    vector_u->setValues(12,13);
    vector_v->setValues(2,-5);
    vector_x->displaySumVectors(vector_u, vector_v);
    system("pause");
    cout << "\n";
    return 0;
}