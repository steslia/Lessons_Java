package Pattern.Behavioural.Visitor;

public class Door implements CarPart{
    private int number;

    public int getNumber() {
        return number;
    }

    public Door(int number) {
        this.number = number;
    }

    //Передаем в метод visit этот объект
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
