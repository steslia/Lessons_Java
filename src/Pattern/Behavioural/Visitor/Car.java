package Pattern.Behavioural.Visitor;

public class Car implements CarPart{
    private CarPart[] carParts;

    public Car() {
        carParts = new CarPart[]{
                new Door(1), new Door(3), new Door(4),
                new Wheel(1), new Wheel(3), new Wheel(4)
        };
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (CarPart part : carParts){
            part.accept(visitor);
        }
    }
}
