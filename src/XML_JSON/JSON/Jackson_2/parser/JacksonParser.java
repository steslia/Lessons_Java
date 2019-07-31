package XML_JSON.JSON.Jackson_2.parser;

import XML_JSON.JSON.Jackson_2.entity.CurrencyRate;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class JacksonParser {

    public static void parseJackson(String url) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        //Получаем массив элементов CurrencyRate, и передаем ссылку какой JSON считывать и откуда(в данном случ из сайта)
        CurrencyRate[] currencyRate = objectMapper.readValue(new URL(url), CurrencyRate[].class);

        //Использую стримы для вывода
        Arrays.stream(currencyRate).filter(s->!s.getFrom().equals("BTC")).forEach(System.out::println);

        //Еще можно так делать форматированый вывод
        //System.out.printf(Locale.ENGLISH, "%10s %.2f", currencyRate[1].toString(), currencyRate[1].getBuy());

        //writerWithDefaultPrettyPrinter() используем для нормального отображения JSON в фале при создании этого файла
        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(currencyRate);

        //указываем путь к файлу, если его нет то создаем
        Files.write(Paths.get("C:\\Users\\Sozin\\Desktop\\Clone git repository\\Lessons\\src\\XML_JSON\\JSON\\Jackson_2\\gsonCurrency.json")
                ,jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
