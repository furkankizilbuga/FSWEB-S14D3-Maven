package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("className: " + getClass().getSimpleName());
        return getName() + " is starting engine.";
    }

    public String drive() {
        runEngine(this);
        return getName() + " is driving.";
    }

    protected String runEngine(CarSkeleton carSkeleton) {
        if(carSkeleton instanceof  ElectricCar) {
            double avgKmPerCharge = ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar)carSkeleton).getBatterySize();
            return "The car engine is starting with electric. Per charge: " + avgKmPerCharge + " battery size: " + batterySize;
        }
        else if(carSkeleton instanceof HybridCar) {
            double avgKmPerLiter = ((HybridCar)carSkeleton).getAvgKmPerLiter();
            int batterySize = ((HybridCar)carSkeleton).getBatterySize();
            int cylinders = ((HybridCar)carSkeleton).getBatterySize();
            return "The car engine is starting with hybrid. Per liter: " + avgKmPerLiter + " battery size: " + batterySize + " cylinders: " + cylinders;
        }
        else if(carSkeleton instanceof  GasPoweredCar) {
            double avgKmPerLiter = ((GasPoweredCar)carSkeleton).getAverageKmPerLiter();
            int cylinders = ((GasPoweredCar)carSkeleton).getCylinders();
            return "The car engine is starting with hybrid. Per liter: " + avgKmPerLiter + " cylinders: " + cylinders;
        } else
            return "";
    }



}
