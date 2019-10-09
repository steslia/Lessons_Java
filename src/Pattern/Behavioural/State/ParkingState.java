package Pattern.Behavioural.State;

public class ParkingState implements State {
    private Car car;

    public ParkingState(Car car) {
        this.car = car;
    }

    @Override
    public void handel() {
        System.out.println("Switch to parking state");
    }
}
