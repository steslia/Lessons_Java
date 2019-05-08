package HomeTaskOOP.TwoLessons;

public class Circle extends Shape {

    private Point a;
    private Point b;
    private double radius;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
        radius = Point.calculationDistance(a, b);
    }


    @Override
    double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
