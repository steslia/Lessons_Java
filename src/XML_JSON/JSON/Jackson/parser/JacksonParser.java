package XML_JSON.JSON.Jackson.parser;

import XML_JSON.JSON.Jackson.entity.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonParser {
    public static void parseJSON (String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(new File(path),Person.class);
        System.out.println(person);
        System.out.println(person.getFirstName());
    }
}
