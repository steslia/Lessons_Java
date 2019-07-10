package Lambdas;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface ElementProcessor<T extends Number> {
    double process(T element);
}

public class LambdaExample {
    //Тест метод для класса MethodReference
    public void test(String s){

    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(6.5);
        doubleList.add(8.5);
        doubleList.add(5.1);

        //В лямбда выражение можем использовать свой метод
        processElement(integerList, x -> multiplay(x.intValue()));

        //этом методе мы вызываем лямбда(это по факту анонимное переопределение метода интерфейса)
        processElement(integerList, x -> x + x);
        //Это Method reference, это тоже самое, что лямбда, только синтаксис другой
        //Если точнее то это ссылка на метод
        processElement(doubleList, Math::sin);
        Thread thread = new Thread(() -> System.out.println("Test lambda run"));
        thread.start();

        //Внутри лямбда выражения можем обявлять поля
        Runnable runnable = () -> {
            int a = 10;
            String s = "test";
            System.out.println(s + a);
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

    }

    //Дженерик метод
    private static <T extends Number> void processElement(List<T> list, ElementProcessor<T> function) {
        List<Double> doubleList = new ArrayList<>();
        for (T number : list) {
            doubleList.add(function.process(number));
        }
        System.out.println(doubleList);
    }

    private static double multiplay(int number) {
        return number * number * 1.0;
    }
}

