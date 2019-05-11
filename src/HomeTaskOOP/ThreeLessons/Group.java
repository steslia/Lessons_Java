package HomeTaskOOP.ThreeLessons;

import java.util.Arrays;

public class Group {

    //Создаем массив который будет заполнен объектами студент
    private static Student[] groupStudens = new Student[10];

    public static void addStudent(Student student) {
        for (int i = 0; i < groupStudens.length; i++) {
            if (groupStudens[i] == null) {
                groupStudens[i] = student;
                break;
            } else if (groupStudens[groupStudens.length - 1] != null) {
                System.out.println("Group is full");
                //Вызов метода с ошибкой
                overStudent();

                //Вызов метода который выдает ошибку, сдесь мы его ловим обрабатываем
                // метод объекта искючения e.printStackTrace(); печатает информацию об исключении (текст красным цветом)
                //После чего програма дальше работает
/*                try {
                    overStudent();
                } catch (MyException e) {
                    System.out.println("system");
                    e.printStackTrace();
                }
                break;*/
            }
        }
    }


    //Метод в котором генерируеться нами созданая ошибка
    private static void overStudent() throws MyException{
        throw new MyException("My Exception Run");
    }

    //Удаляем студентов
    public static void deleteStudent(Student student) {
        for (int i = 0; i < groupStudens.length; i++) {
            if (groupStudens[i] != null) {
                groupStudens[i] = null;
                break;
            } else if (groupStudens[groupStudens.length - 1] == null) {
                System.out.println("Group is clear");
                break;
            }
        }
    }


    void goString() {
        //Создаем новый масив и заполняем его фамилими студентов
        String[] student = new String[groupStudens.length];
        int calk = 1;
        for (int i = 0; i < groupStudens.length; i++) {
            if (groupStudens[i] != null) {
                student[i] = groupStudens[i].getSurname() + " " + calk++;
            } else {
                student[i] = "";
            }
        }

        //Сортируем фамилии студнтов
        Arrays.sort(student);

        //Выводим отсортированые фамилии
        for (String sortStudent : student) {
            if (sortStudent != "") {
                System.out.println(sortStudent);
            }
        }

    }


}
