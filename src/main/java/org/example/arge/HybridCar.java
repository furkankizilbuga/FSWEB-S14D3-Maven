package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLiter;
    private int cylinders;
    private int batterySize;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
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
