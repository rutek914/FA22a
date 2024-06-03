package JAVA_Zadania.Chapter_8;

interface IVehicle {
    static final int PASSENGERS = 2;
    static final int FUELCAP = 10;
    static final double LKM = 7;

    public abstract int range();

    public abstract double fuelneeded(int km);

    public abstract int getPassengers();

    public abstract void setPassengers(int p);

    public abstract void setFuelCap(int f);

    public abstract int getFuelCap();

    public abstract void setLKM(double lkm);

    public abstract double getLKM();

}
