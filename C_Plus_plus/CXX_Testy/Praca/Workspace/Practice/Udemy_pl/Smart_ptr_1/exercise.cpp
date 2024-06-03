#include <iostream>
#include <memory>
#include "exercise.h"

using namespace std;

Unique::Unique(){
    cout << "The memory for a uniquze pointer has been allocated" << endl;
}

Unique::~Unique(){
    cout << "The memory for a unique pointer has been deallocated" << endl;
}

int main(){

    unique_ptr<Unique> u_ptr(new Unique);
    
    return 0;
}