package XML_JSON.JSON.GSON;

import XML_JSON.JSON.GSON.parser.GsonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }

}
