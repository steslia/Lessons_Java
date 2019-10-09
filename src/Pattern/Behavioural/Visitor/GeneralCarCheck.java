package Pattern.Behavioural.Visitor;

//Реализуем интерфес Visitor и его объекты
public class GeneralCarCheck implements Visitor {
    @Override
    public void visit(Door door) {
        System.out.println("Check the door " + door.getNumber());
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Check the wheel " + wheel.getCount());
    }

    @Override
    public void visit(Car car) {
        System.out.println("Check car");
    }
}
