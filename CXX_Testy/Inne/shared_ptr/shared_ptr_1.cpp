#include <memory>
#include <iostream>

int main() {
    std::shared_ptr<int> ptr1 = std::make_shared<int>(42);  // Tworzenie shared_ptr z dynamicznie zaalokowanym obiektem int
    std::shared_ptr<int> ptr2 = ptr1;  // Przypisanie ptr2 do tego samego obiektu co ptr1 (referencja)
    std::cout << "Liczba odwolan do obiektu: " << ptr1.use_count() << std::endl;  // Wyświetlenie liczby odwołań

    ptr1.reset();  // Zerowanie ptr1, zmniejszenie liczby odwołań
    std::cout << "Liczba odwolan do obiektu po zwolnieniu ptr1: " << ptr2.use_count() << std::endl;
    std::cout << "Liczba odwolan do obiektu po zwolnieniu ptr1: " << ptr1.use_count() << std::endl;

    system("pause");
    return 0;
}