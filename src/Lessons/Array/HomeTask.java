package Lessons.Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Home Work
        // Task 1
        // Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.

        int[] mass = {0, 5, 2, 4, 7, 1, 3, 19};
        int calk = 0;

        System.out.println(Arrays.toString(mass)); //Преобазуем массив в строку и выводим его

        for (int i : mass) {
            if (i % 2 == 1) {
                ++calk;
            }
        }
        System.out.println(calk);

        // Task 2
        // создания массива целых чисел (размер вводиться с клавиатуры) и возможности
        // заполнения каждого его элемента вручную. Выведите этот массив на экран

        System.out.println("Input length massiv");
        int inputLengthMass = sc.nextInt();
        int[] array = new int[inputLengthMass];

        //Проходим по каждому элем массива и записываем в него число
        for (int j = 0; j < array.length; j++) {
            int inputElementMass = sc.nextInt();
            array[j] = inputElementMass;

        }
        //выводим массив
        for (int b : array) {
            System.out.print(b + " ");
        }

        // Task 3

    }
}
