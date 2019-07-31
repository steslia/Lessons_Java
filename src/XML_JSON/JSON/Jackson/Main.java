package XML_JSON.JSON.Jackson;

import XML_JSON.JSON.Jackson.parser.JacksonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJSON("C:\\Users\\Sozin\\Desktop\\Clone git repository" +
                "\\Lessons\\src\\XML_JSON\\JSON\\Jackson\\persons.json");
    }
}
