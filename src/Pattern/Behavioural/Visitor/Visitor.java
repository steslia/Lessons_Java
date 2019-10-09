package Pattern.Behavioural.Visitor;

//Паттерн используеться если мы в логике не хотип описывать привидение типов явно и неявно,
// для того чтобы отработали какието мотоды, тогда мы просто описываем этот метод для каждого из типов
// что может прийти в качестве параметра
public interface Visitor {
    void visit(Door door);
    void visit(Wheel wheel);
    void visit(Car car);
}
