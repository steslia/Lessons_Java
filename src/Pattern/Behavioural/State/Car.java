package Pattern.Behavioural.State;

public class Car {
    private State state;

    public Car() {
        this.state = new ParkingState(this);
    }

    //Метод меняет состояние
    public void switchTransmission(){
        if (state.getClass() == ParkingState.class)
            state = new DrivingState(this);
        else
            state = new ParkingState(this);
    }

    //Запросить состояние
    public void requestState(){
        state.handel();
    }
}
