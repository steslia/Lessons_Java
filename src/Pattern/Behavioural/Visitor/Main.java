package Pattern.Behavioural.Visitor;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        //В метод объекта передаем реализацию интерфейса Visitor
        // и у нас срабатывает нужный метод под нужный тип
        // вся логика по методом описанна в классе реализаторе
        // и мы не делаем никаких привидений типов, + все скрыто от пользователя
        car.accept(new GeneralCarCheck());
    }
}
