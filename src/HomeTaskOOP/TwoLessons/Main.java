package HomeTaskOOP.TwoLessons;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(new Point(0,3),new Point(9,14),new Point(5,20));

        System.out.printf("Perimetr triangle = %.2f %n", triangle.getPerimetr());
        System.out.printf("Area triangle = %.0f %n %n", triangle.getArea());

        Shape circle = new Circle(new Point(0,0),new Point(3,3));

        System.out.printf("Perimetr circle = %.2f %n", circle.getPerimetr());
        System.out.printf("Area circle = %.0f %n %n", circle.getArea());

        Square square = new Square(new Point(1,5),new Point(6,10));

        System.out.printf("Perimetr square = %.2f %n", square.getPerimetr());
        System.out.printf("Area square = %.0f %n", square.getArea());

        Broad broad = new Broad();

        broad.addShape(triangle,1);
        broad.addShape(triangle,3);
        broad.addShape(triangle,2);

        broad.informationBroad();

    }
}
