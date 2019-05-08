package LessonsOOP.domainmodel;

public class Employee {

    private static int id;
    private String name;
    private String position;
    private String departament;
    private int salary;

    //Статический блок инициализации
    static {
        id = 100;
        System.out.println("Static init block ");
    }

    //Блок инициализации
    {
        departament = "";
        System.out.println("Not-static init block ");
    }

    //Создаем второй конструктор который ссылаеться на конструктор что за ним и который
    // на 4 элем. при вызове переменные что мы передаем переходят в следующий конструктор
    // и там присваиваються потом идет возврат и заканчиваеться робота этого конструктора
    // тоесть идет линейно выполнение работы а конец в обратном порядке
    public Employee(String name, String position, int salary) {
        this(name, position, salary, "IT");
        System.out.println("with 3 params called");
    }

    //Создаем конструктор

    public Employee(String name, String position, int salary, String departament) {
        id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        System.out.println("with 4 params called");
    }

    //Пример оверлодинга, мы тут обявили 2 конструктор
    // если при вызове первого конструктора не будут переданны значения чтобы он не выдавал ошибок

    public Employee() {

    }


    //Переводим все наши значения в строку, чтобы потом удобно выводить одним мотодом
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}


