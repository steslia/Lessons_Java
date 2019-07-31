package XML_JSON.JSON.GSON.parser;

import XML_JSON.JSON.GSON.entity.CurrencyRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class GsonParser {

    public static void parseJson(String url) throws IOException {
        //
        GsonBuilder gsonBuilder = new GsonBuilder();
        //Для красивой записи в файл
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();
        //Отправляем запрос на Приват банк и считываем файл
        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        //Получаем массив элементов CurrencyRate
        CurrencyRate[] currencyRate = gson.fromJson(jsonReader, CurrencyRate[].class);

        //Использую стримы для вывода
        Arrays.stream(currencyRate).filter(s->!s.getFrom().equals("BTC")).forEach(System.out::println);

        //Еще можно так делать форматированый вывод
        //System.out.printf(Locale.ENGLISH, "%10s %.2f", currencyRate[1].toString(), currencyRate[1].getBuy());
        String gsonToString = gson.toJson(currencyRate);
        //указываем путь к файлу, если его нет то создаем
        Files.write(Paths.get("C:\\Users\\Sozin\\Desktop\\Clone git repository\\Lessons\\src\\XML_JSON\\JSON\\GSON\\gsonCurrency.json")
                ,gsonToString.getBytes(), StandardOpenOption.CREATE);
    }
}
