package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateRun {
    public static void main(String[] args) throws ParseException {
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

        //Делаем проверку входит ли время в диапазон который мы указываем с клавиатуры
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        Date testDate = dateFormat.parse(sc.nextLine());
        Date startDate = dateFormat.parse(sc.nextLine());
        Date endDate = dateFormat.parse(sc.nextLine());

        //Написал так чтобы работало, даже если testDate был точно равен одному из конечных случаев.
        if (!(testDate.before(startDate) || testDate.after(endDate))) {
            System.out.println(dateFormat.format(testDate));
        }
    }
}
