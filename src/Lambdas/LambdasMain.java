package Lambdas;

import java.util.Arrays;

public class LambdasMain {
    public static void main(String[] args) {
        String[] stringsArray = {"asdda", " qweeeqw", "qqqqqer", "asddddad"};

        //Обевляем лябда выражение, мы может тип данных и не указывать, он сам его определит по типу нашего массыва
        //Еще оно само определает в какой интерфейс мы переопределяем, в зависимости, от принимаего типа в методе
        //В данном случаи 2 параметром он принимает Comparator
        Arrays.sort(stringsArray, (String s1, String s2) ->
                s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 2)
        );

        //Данный метод ничего не делает он для примера
        //Внутри лямбды может быть еще код и условия и цыклы и тд..
        //Если кода больше то мы оборачиваем его в {}
        Arrays.sort(stringsArray, (s1, s2) -> {
            if (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 2) > 0) {
                return 1;
            } else {
                return -1;
            }
        });

        //Тоже пример в который мы не передаем никаких параметоров, так как он void
        Thread thread = new Thread(() -> System.out.println("Hello"));
        thread.start();

        //Тут мы создаем екземпяр типа Runnable и сразу переопределяем его метод run
        //Так как интерфейс Runnable функциональный то мы можем использовать его в лямдах
        Runnable runnable = () -> System.out.println("Hello");

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
