package HomeTaskOOP.TwoLessons;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimetr() {
        double perimetr = Point.calculationDistance(a, b)
                + Point.calculationDistance(b, c)
                + Point.calculationDistance(c, a);
        return perimetr;
    }

    @Override
    double getArea() {
        double semiPerimeter = getPerimetr() / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - Point.calculationDistance(a, b))
                * (semiPerimeter - Point.calculationDistance(b, c))
                * (semiPerimeter - Point.calculationDistance(c, a)));
        return area;
    }
}
