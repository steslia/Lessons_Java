package LessonsOOP.constructors;

//подключаем класс с другого пакета

import LessonsOOP.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {

        //Создаем объект ссылаесь на класс в другом пакете
        Employee emp = new Employee("Serg", "junior", 20);

        //Вывод всех элем emp из-за того что там описан метод toString
        System.out.println(emp);

        Employee test = new Employee();



    }
}
