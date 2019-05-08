package Lessons.Methods;

public class Main {

    // Ctrl + Alt + V - быстрое создание переменной

    public static void main(String[] args) {
        int oneArgument = 5;
        int twoArgument = 8;

        printMessage();
        printMessageName("Serg");

        //Передаем значение в метод(перменные в даном случаи)
        int rectangleSquare = calcRectangleSquare(oneArgument, twoArgument);
        System.out.println("RectengleSquare = " + rectangleSquare);

        int square = calcSqu(twoArgument);
        System.out.println("Square = " + square);

        //Сдесь мы в параметр "а" передаем любое количество значений и считаем их суму
        // Пример метода с произвольным количеством параметров одного типа
        System.out.println("Sum = " + sum(4, 1, 4, 5, 6, 7, 8));

        //Подсчитываем сумму методов, не присваивая их значения переменным, а сразу счиаем при вызове
        System.out.println("Rectengle of sum " + (calcRectangleSquare(oneArgument, twoArgument) + calcSqu(twoArgument)));

        //Вызов рекурсии
        System.out.println("Factoreal = " + fact(3));
    }

    static void printMessage() {
        System.out.println("Hi");
    }

    static void printMessageName(String name) {
        System.out.println("Hi " + name + "");
    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }

    //Пример метода с произвольным количеством параметров одного типа
    // Переменные неявно упакуются в массив a
    // В b все так же можно передать только один параметр
    static int sum(int b, int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    //Возвращаем значение без инициализации переменной в методе
    static int calcSqu(int x) {
        return x * x;
    }

    //Рекурсия
    //Рекурсивный метод вычисления факториала. Если параметр меньше либо равен 1,
    //то возвращаем 1. Если нет то умножаем параметр на результат вызова этого же метода
    //но с параметром на 1 меньше.
    public static int fact(int n) {
        return n <= 1 ? 1 : n * fact(n - 1);
    }

}
