package Lessons.Methods;

public class HomeTask {
    public static void main(String[] args) {

        maxValue();
        System.out.println(sum("klg", 10, 12.2));
        rectangle(4, 8);
        element(56);

    }

    // Home Work
    // Task 1
    //Напишите метод который вернет максимальное число из массива целых чисел.
    private static void maxValue() {
        int[] mass = {1, 4, 5, 6, 8, 90, 12, 534};
        int max = mass[0];

        //Если элем массива больше переменной max, тогда max присваиваем значение этого элемен
        //По началу max равен 0 элем массива
        for (int i : mass) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    //Task 2
    //Метод параметрами которого являются  - целое число, вещественное число и строка.
    //Возвращает он конкатенацию строки с суммой вещественного и целого числа.
    private static String sum(String x, int b, double c) {
        return x + " " + (b + c);
    }

    //Task 3
    //Реализуйте метод рисующий на экране прямоугольник из звездочек «*» — его параметрами
    //будут целые числа которые описывают длину и ширину такого прямоугольника.
    private static void rectangle(int height, int width) {
        //Рисуем верхнюю линию прямоугольника
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 0; j < height - 2; j++) {
            for (int k = 0; k < width; k++) {
                if (k == 0 || k == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Рисуем нижнею линию прямоугольника
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //Task 4
    //Напишите метод который реализует линейный поиск элемента
    //в массиве целых чисел. Если такой элемент в массиве есть то верните его индекс,
    //если нет то метод должен возвращать число - «-1»
    private static int[] mass(int... array){
        return array;
    }

    private static void element(int x) {
        int[] array = mass(12, 23,41,41,56,77,88,99,32);
        int test = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == x){
                test = i;
            }
        }
        if (test>=0){
            System.out.println(test);
        }else {
            System.out.println(test);
        }
    }
}