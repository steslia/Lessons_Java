package Collections.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MapLauncher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> wordMap = new HashMap<>();

        //Розбиваем строку на миссив слов
        String string = reader.readLine();
        String[] tokens = string.split(" ");

        //Цикл для подсчета повторяющихся слов в введеном тексте
        for (String token : tokens){
            //Переводим слово в нижний регистр и присваиваем в временную переменную
            String word = token.toLowerCase();
            //Создаем временную переменную и в нее помещаем значение по клучю из карты
            //Это количество повторений слова
            Integer count = wordMap.get(word);

            //Если слово повторилось, а там тип ссылки null(пустая внутри)
            //Тогда присваиваем значение 1, и при этом перезаписываем ключ
            if (count == null){
                wordMap.put(word,1);
            } else {
                wordMap.put(word,count+1);
            }
        }

        NavigableSet<WordWrapper> wordWrappers = convertToSet(wordMap);
        printSet(wordWrappers);

//        print(wordMap);
    }

    private static void printSet(NavigableSet<WordWrapper> wordWrappers){
        for (WordWrapper wrapper : wordWrappers){
            System.out.println(wrapper);
        }
    }

    //Конвертируем нашу Map в Set и сортируем по нашему переопределенному методу сортировки
    private static NavigableSet<WordWrapper> convertToSet(Map<String, Integer> wordMap){
        //Создаем TreeSet который хранит тип нашего класса WordWrapper для сортировки
        //Класс WordWrapper будет хранить данные из Карты и он нужен для сортировки так как в нем переопределен метод compareTo
        NavigableSet<WordWrapper> wordSet = new TreeSet<>();
        //Получаем пару клуч - значения, в наш Set создаем объект WordWrapper и передаем клуч и значения с нашей карты
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()){
            wordSet.add(new WordWrapper(entry.getKey(), entry.getValue()));
        }

        return wordSet;
    }

    //В TreeMap сортировка происходт по ключу
    private static void print(Map<String, Integer> wordMap){
        //Создаем отсортированную Мапу и в нее передаем мапу что передали в метод
        Map<String, Integer> wordTreeMap = new TreeMap<>(wordMap);
        // Набор ключей записываем в Set<String>
        Set<String> keys = wordTreeMap.keySet();

        //Вывлдим ключи и значения
        for (String key : keys){
            System.out.printf("%-10s%-10s \n", key, wordMap.get(key));
        }
    }

}
