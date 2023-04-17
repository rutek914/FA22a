package JAVA_Testy.TruckDemo;

public class Vehicle {
    private int passengers, fuelcap;
    private double lkm;

    public Vehicle(int passengers, int fuelcap, double lkm) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.lkm = lkm;
    }

    int range() {
        return (int) (fuelcap / lkm * 100);
    }

    double fuelneeded(int km) {
        return (double) km / 100 * km;
    }

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    double getLkm() {
        return getLkm();
    }

    void setLkm(double lkm) {
        this.lkm = lkm;
    }
}
