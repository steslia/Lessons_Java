package Lessons.String;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Task 1 Введите строку текста с клавиатуры — реализуйте программу
        для возможности подсчета количества символа — 'b' в этой строке,
        с выводом результат на экран*/

        System.out.println("Input text");
        String string = sc.nextLine();

        //Создаем масив символов в него записываем наш текс при этом розделив
        //его по символьно с помощу метода .toCharArray и переводим текс
        //в нижний регисть методом .toLowerCase
        char[] stringArray = string.toLowerCase().toCharArray();

        int calc = 0;

        for (char i : stringArray) {
            if (i == 'b') {
                calc++;
            }
        }
        System.out.println(calc);

        calcWords(string);
    }

    //Task 2
    //Напишите метод который вернет количество слов в строке текста.
    private static void calcWords(String string) {
        int calc = 0;

        //Разделяем строку по пробелу и записываем в массив
        String[] wordsArray = string.split("[ ]");
        for (String i : wordsArray){

            //Сравниваем строку в масиве с объектов в данном случаи пробел и получаем булевое значение
            //В данном случаи нужно для того, чтобы не считать пробелы при подсчете слов
            boolean equals = "".equals(i);
            if (!equals){
                calc++;
            }

        }
        System.out.println("Words in this String = "+calc);
    }
}
