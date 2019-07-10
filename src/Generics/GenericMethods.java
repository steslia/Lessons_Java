package Generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {0.234, 8.43, 4.12, 2.90};
        String[] stringArray = {"wqe", "da", "asd"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println("Max " + findMax(intArray));
        System.out.println("Max " + findMax(doubleArray));

        //Преобразуем наш массив интов в список,
        //а компилятор автоматически преобразует его в список типа Number
        printElement(Arrays.asList(intArray));


        //У этого класса конструктор может принимать другой
        //Параметр в отличии от его типа(тип Int, коструктор String)
        MyBox<Integer> myBox = new MyBox<Integer>("s");

    }

    private static <T> void printArray(T[] array) {
        System.out.println("Дженерик метод");
        for (T element : array) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    //Ограничеваем Generic метод, чтобы внутри было только число,
    //и у которого переопеделен интерфес Comparable
    private static <T extends Number & Comparable> T findMax(T[] intArray) {
        T max = intArray[0];
        for (T element : intArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    //В качестве параметра метода передавать ему будут List<Number>
    private static void printElement (List<Number> list){
        for (Number number : list){
            System.out.println(number);
        }

    }

    /*E - Element
    K - Key
    N - Number
    T - Type
    V - Value
    S,U,V etc.*/

}

