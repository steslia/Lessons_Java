package JavaRushNotPublished;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/


/* 10 лекция 17 уровень 1 задание
Программа запускается с одним из следующих наборов параметров:
        -c name sex bd
        -u id name sex bd
        -d id
        -i id

        Значения параметров:
        name - имя, String
        sex - пол, "м" или "ж", одна буква
        bd - дата рождения в следующем формате 15/04/1990
        -c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
        -u - обновляет данные человека с данным id
        -d - производит логическое удаление человека с id, заменяет все его данные на null
        -i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

        id соответствует индексу в списке.
        Все люди должны храниться в allPeople.
        Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        //start here - начни тут

        String token = reader.readLine();
        Person person;
        int id;

        switch (token){
            case "-c":
                person = getPercon();
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
                break;

            case "-u":
                id = Integer.parseInt(reader.readLine());
                person = getPercon();
                allPeople.set(id,person);

            case "-d":
                id = Integer.parseInt(reader.readLine());
                person = new Person(null, null, null);
                allPeople.set(id, person);
                System.out.println(allPeople.get(id));
                break;

            case "-i":
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                id = Integer.parseInt(reader.readLine());
                person = allPeople.get(id);
                String strDate = sdf.format(person.getBirthDate());
                System.out.println(person.getName() + " " + person.getSex().getSex() + " " + strDate);
                break;

            default:
                System.out.println("Unknown command. Set -c / -u / -d / -i command.");
        }
    }

    public static Person getPercon () throws IOException, ParseException {
        String name = namePerson();
        Sex sex = sexPerson();
        Date date = datePerson();
        return new Person(name,sex,date);
    }

    private static String namePerson() throws IOException {
        String name = reader.readLine();
        return name;
    }

    private static Sex sexPerson() throws IOException {
        String sexString = reader.readLine();
        Sex sex = null;

        switch (sexString){
            case "м":
                sex = Sex.MALE;
                break;

            case "ж":
                sex = Sex.FEMALE;
                break;
        }

        return sex;
    }

    private static Date datePerson() throws IOException, ParseException {
        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String strDate = reader.readLine();

        date = sdf.parse(strDate);
        return date;
    }
}
