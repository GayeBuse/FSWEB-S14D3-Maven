package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double getAverageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.getAverageKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return getAverageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setAvgKmPerLiter(double getAverageKmPerLiter) {
        this.getAverageKmPerLiter = getAverageKmPerLiter;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
