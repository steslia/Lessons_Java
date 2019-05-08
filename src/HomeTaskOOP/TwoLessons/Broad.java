package HomeTaskOOP.TwoLessons;

public class Broad {
    private Shape[] sectors = new Shape[4];

    public void addShape(Shape shape, int part) {
        if (part > 0 && part < 5) {
            if (sectors[part - 1] == null) {
                sectors[part - 1] = shape;
                System.out.println("In part " + part + " of the board added shape: " +
                        shape.getClass().getName().split("[.]")[2]);
            } else {
                System.out.println("You cannot add a shape, the required part of the board is busy.");
            }
        } else {
            System.out.println("Only board divided into 4 parts");
        }
    }

    public void deleteShape(Shape shape, int part) {
        if (part > 0 && part < 5) {
            if (sectors[part - 1] != null) {
                sectors[part - 1] = null;
                System.out.println("In part " + part + " of the board delete shape: "
                        + shape.getClass().getName().split("[.]")[2]);
            } else {
                System.out.println("You cannot delete a shape, this part of the board is empty.");
            }
        } else {
            System.out.println("Only board divided into 4 parts");
        }
    }

    public void informationBroad() {
        double perimetr = 0;
        for (int i = 0; i < sectors.length; i++) {
            if (sectors[i] != null) {
                perimetr += sectors[i].getArea();
                System.out.println("In part " + (i + 1) + " shape: "
                        + sectors[i].getClass().getName().split("[.]")[2] + "");
            } else {
                System.out.println("In part " + (i + 1) + " empty");
            }
        }
        System.out.printf("sum area = %.2f", perimetr);
    }
}
