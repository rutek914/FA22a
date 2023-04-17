package JAVA_Zadania.Chapter_7;

public class Circle extends TwodShape {
    final double PI = 3.14;
    private double radius;

    public Circle(double x, double radius) {
        super(x, "kolo");
        this.radius = radius;
    }

    double area() {
        return PI * (radius * radius);
    }

}

class Kupa {
    public static void main(String[] args) {
        var kolko = new Circle(5, 10);
        System.out.println(kolko.area());
    }
}
