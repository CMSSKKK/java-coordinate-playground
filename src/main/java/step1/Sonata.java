package step1;

public class Sonata extends Car {
    private static final String NAME = "SONATA";
    private static final double DISTANCE_PER_LITER = 10;

    private double tripDistance;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    public String getName() {
        return NAME;
    }


}
