package Pattern.Behavioural.State;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        //Перевод в другое состояние
        car.switchTransmission();
        car.requestState();

        //Перевод в другое состояние
        car.switchTransmission();
        car.requestState();
    }
}
