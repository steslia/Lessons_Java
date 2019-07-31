package XML_JSON.JSON.Jackson_2;

import XML_JSON.JSON.Jackson_2.parser.JacksonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJackson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
