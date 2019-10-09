package Pattern.Behavioural.State;

public class DrivingState implements State{
    private Car car;

    public DrivingState(Car car) {
        this.car = car;
    }

    @Override
    public void handel() {
        System.out.println("Switch to driving state");
    }
}
