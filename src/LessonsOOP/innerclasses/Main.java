package LessonsOOP.innerclasses;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Nokia", "X360");

        //Инициализируем наш внутрений класс
        phone.turnOn();
        Display display = phone.getDisplay();
        Display.Pixel pixel = display.new Pixel(123,5235, Display.Color.BLUE);


    }

}
