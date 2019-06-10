package LessonsOOP.IntroductionOOP;

public class Main {
    public static void main(String[] args) {

        //Создаем объект машина на основе класса машина
        Car car = new Car();

        //Задаем параметры через методы set() и вызываем другие методы
        car.setMark("BMV");
        car.setYear(2010);
        car.setColor("red");
        car.setSize(Size.AVERAGE);
        car.setSpeed(140);
        car.print();
        car.beep();
        System.out.println(car.getSize().getSize());

        System.out.println();

        car.setMark("Cherry");
        car.setYear(2016);
        car.setColor("red");
        car.setSize(Size.SMALL);
        car.setSpeed(100);
        car.print();
        car.beep();

        System.out.println();

        car.setMark("Vaz");
        car.setYear(2000);
        car.setColor("green");
        car.setSize(Size.BIG);
        car.setSpeed(80);
        car.print();
        car.beep();

        //Инициализируем элемент перечесления
        //Создаем объект без new
        Size sz = Size.SMALL;

        //Выводим все элементы в Size, он же всвою очередь представлен в данном случаи как массив
        //По этому можем его вывести через цикл
        //Используем встроенный метод enum типа
        for (Size mas : Size.values()) {
            System.out.print(mas + " ");
        }

        //Используем наследованые методы в объекте по enum типу
        System.out.println(sz.getSize());
        System.out.println(sz.name());

    }
}
