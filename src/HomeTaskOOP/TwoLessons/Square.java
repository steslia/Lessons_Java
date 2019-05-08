package HomeTaskOOP.TwoLessons;

public class Square extends Shape {

    private Point a;
    private Point b;

    public Square(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimetr() {
        return 4*Point.calculationDistance(a,b);
    }

    @Override
    double getArea() {
        return Math.pow(Point.calculationDistance(a,b),2);
    }
}
