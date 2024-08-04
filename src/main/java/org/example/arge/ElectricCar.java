package org.example.arge;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public ElectricCar() {
        super();
    }

    @Override
    public String startEngine() {
        return getName() + " is starting engine.";
    }

    @Override
    public String drive() {
        runEngine(this);
        return getName() + " is driving";
    }

    @Override
    protected String runEngine(CarSkeleton carSkeleton) {
        return getName() + " is running engine.";
    }
}
