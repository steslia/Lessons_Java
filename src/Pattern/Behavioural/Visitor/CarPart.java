package Pattern.Behavioural.Visitor;

//Через этот метод будет связь с интерфейсом и объектами определенного типа
public interface CarPart {
    void accept(Visitor visitor);
}
