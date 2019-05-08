package LessonsOOP.IntroductionOOP;

public class Car {

    private static final int WHEEL = 4;
    private static final int ENGINE = 1;
    private int year;
    private int speed;
    private String mark;
    private String color;

    //Создаем переменную со своим типом
    private Size size;


    //Метод для вывода всех наший переменных
    void print() {
        System.out.println(mark);
        System.out.println(color);
        System.out.println(size);
        System.out.println(year);
        System.out.println(speed);
    }

    void beep() {
        switch (size) {
            case SMALL:
                System.out.println("Beep");
                break;
            case AVERAGE:
                System.out.println("BEE-EE-EEP");
                break;
            case BIG:
                System.out.println("BEEP-BEEP-BEEP");
        }
    }

    int acceleration(int speed) {

        //this указывает на переменную в этом классе(или указывает на этот элемент)
        this.speed = this.speed + speed;
        return this.speed;
    }

    //Метод для того чтобы обратиться к переменным с модифик. доступа private
    // из другого класа и присваивать им значения
    void setYear(int year) {
        this.year = year;
    }


    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setSize(Size size) {
        this.size = size;
    }

    void setMark(String mark) {
        this.mark = mark;
    }


    //Метод для отправления значения переменных с модифик. доступа private
    // и пользоваться в другом классе
    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public String getMark() {
        return mark;
    }
}

