package LessonsOOP.innerclasses;

public class CellPhone extends Display{

    private String make;
    private String model;
    private Display display;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Display turnOn() {
        initDisplay();
        return null;
    }

    public void initDisplay() {
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }

}
