package JAVA_Testy.TruckDemo;

public class TruckDemo extends Vehicle {
    private int cargocap;

    public TruckDemo(int passengers, int fuelcap, double lkm, int cargocap) {
        super(passengers, fuelcap, lkm);
        this.cargocap = cargocap;
    }

    public int getCargo() {
        return cargocap;
    }

    public void setCargo(int cargocap) {
        this.cargocap = cargocap;
    }
}
