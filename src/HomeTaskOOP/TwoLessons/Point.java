package HomeTaskOOP.TwoLessons;

public class Point{
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double calculationDistance(Point one, Point two) {
        return Math.sqrt(Math.pow((two.getX() - one.getX()), 2) + Math.pow((two.getY() - one.getY()), 2));
    }
}
