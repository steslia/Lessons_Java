package Lessons.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int array[] = new int[10];

        // Проходим по каждому элем масива и выводим его обычным циклом
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


        // Foreach для прохождения по каждому элем массива и вывод его элем
        for (int i : array) {
            System.out.print(i + " ");

        }
        System.out.println();


    }

}

