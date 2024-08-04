package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
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
