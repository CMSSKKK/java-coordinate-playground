package step1;

public abstract class Car {
    public abstract double getTripDistance();

    public abstract double getDistancePerLiter();

    public abstract String getName();

    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
