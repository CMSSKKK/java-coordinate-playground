package domain;

import java.util.Objects;

public class Point {
    private static final int LIMIT_MAX_NO = 24;
    private static final int LIMIT_MIN_NO = 1;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        checkExceed(x, y);
        this.x = x;
        this.y = y;
    }

    private void checkExceed(int x, int y) {
        if (exceedLimit(x) || exceedLimit(y)) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean exceedLimit(int no) {
        return no > LIMIT_MAX_NO || no < LIMIT_MIN_NO;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double getDistance(Point point) {
        double xLength = xDistance(point);
        double yLength = yDistance(point);
        return Math.sqrt(xLength+yLength);
    }

    private double xDistance(Point point) {
        return Math.pow(this.x - point.getX(),2);
    }

    private double yDistance(Point point) {
        return Math.pow(this.y - point.getY(),2);
    }


}
