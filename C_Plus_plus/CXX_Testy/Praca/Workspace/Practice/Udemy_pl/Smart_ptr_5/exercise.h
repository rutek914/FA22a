#include <iostream>
#include <memory>

using namespace std;

class Unique {
protected:
    int x,y;

public:
    void setValues(int p_x, int p_y);
    void displaySumVectors(unique_ptr<Unique>& ptr_u, unique_ptr<Unique>& ptr_v);
};