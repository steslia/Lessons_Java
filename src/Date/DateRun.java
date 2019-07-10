package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();

        //Указываем формат в котором мы будем ввобдить дату(можем через пробел, точку, двоиточие)
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String dateText = "";
        System.out.println("Input date");
        dateText = sc.nextLine();

        //Парсим строку в формат даты
        //Исключение так как оно проверяемое
        try {
            date = sdf.parse(dateText);
        } catch (ParseException e) {
            System.out.println(e);
        }

        //Создаем новый формат для вывода нашей даты
        SimpleDateFormat sdfOne = new SimpleDateFormat("dd MMMM yyyy");

        //Парсим из даты в строку
        String text = sdfOne.format(date);

        //Выводим
        System.out.println(text);
        sc.close();
    }
}
