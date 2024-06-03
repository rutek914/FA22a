package JAVA_Zadania.Chapter_7;

public abstract class TwodShape {
    private double width, height;
    private String name;

    public TwodShape() {
        width = height = 0.0;
        name = "none";
    }

    public TwodShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    public TwodShape(double x, String n) {
        width = height = x;
        name = n;
    }

    abstract double area();
}
