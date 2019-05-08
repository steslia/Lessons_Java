package LessonsOOP.anonimus_class;

public class CellPhone {
    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;
    private AbstractPhoneButton button;

    //Внутри классов можно объявлять интерфейс
    public interface AbstractPhoneButton{
        void click();
    }

    public void initButton(){
        //Описываем Анонимный класс
        //Анонимный класс это клас у которого нет имени
        //У нас какой-то клас без имени имплементирует тот же интерфейс AbstractPhoneButton
        button = new AbstractPhoneButton() {
            @Override
            public void click() {
                System.out.println("Button click");
            }
        };
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {
        initDisplay();

        //Инициализируем наш радио модуль
        gsm = new RadioModule();

        initButton();
    }

    public void call(String number){
        //Используем вызов кнопки
        button.click();

        gsm.call(number);
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
