package Pattern.Behavioural.Visitor;

public class Wheel implements CarPart {
    private int count;

    public int getCount() {
        return count;
    }

    public Wheel(int count) {
        this.count = count;
    }

    //Передаем в метод visit этот объект
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
