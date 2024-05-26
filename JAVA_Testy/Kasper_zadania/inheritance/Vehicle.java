public abstract class Vehicle {

    protected String color;
    protected String type;
    protected boolean isMoving;

    protected Vehicle(String color, String model) {
        this.color = color;
        this.type = model;
    }

    @Override
    public String toString() {
        String moves;
        if (isMoving) {
            moves = "moving";
        } else {
            moves = "not moving";
        }
        return "This is a " + type
                + " of color " + color
                + " and it is " + moves;
    }

}
