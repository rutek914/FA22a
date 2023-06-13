#include <iostream>
#include <vector>
#include <random>

// Struktura przechowująca współrzędne punktu
struct Point {
    int x;
    int y;
};

// Funkcja generująca losowy kształt figury
std::vector<Point> generateRandomShape(int numPoints, int maxX, int maxY) {
    std::vector<Point> shape;

    std::random_device rd;
    std::mt19937 gen(rd());
    std::uniform_int_distribution<int> distX(0, maxX);
    std::uniform_int_distribution<int> distY(0, maxY);

    for (int i = 0; i < numPoints; ++i) {
        Point point;
        point.x = distX(gen);
        point.y = distY(gen);
        shape.push_back(point);
    }

    return shape;
}

// Funkcja do wyświetlania kształtu
void printShape(const std::vector<Point>& shape) {
    for (const Point& point : shape) {
        std::cout << "(" << point.x << ", " << point.y << ")" << std::endl;
    }
}

int main() {
    int numPoints = 10; // Liczba punktów w kształcie
    int maxX = 100; // Maksymalna wartość x
    int maxY = 100; // Maksymalna wartość y

    std::vector<Point> shape = generateRandomShape(numPoints, maxX, maxY);

    std::cout << "Wygenerowany kształt:" << std::endl;
    printShape(shape);

    return 0;
}
