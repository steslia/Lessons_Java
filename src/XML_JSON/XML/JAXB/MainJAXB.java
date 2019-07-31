package XML_JSON.XML.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MainJAXB {
    public static void main(String[] args) throws JAXBException {
        Catalog catalogBook = new Catalog();

        catalogBook.add(new Book("Bruce Eckel", "Thinking In Java", 100));
        catalogBook.add(new Book("Test Autor", "Thinking In Very Cool", 450));

        File file = new File("C:\\Users\\Sozin\\Desktop\\Clone git repository" +
                "\\Lessons\\src\\XML_JSON\\JAXB\\XMLSaveJAXB.xml");

        Marshaller marshaller = JAXBContext.newInstance().createMarshaller();

        // Читабельное форматирование
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Записываем в файл, marshal(из памяти, в файл)
        marshaller.marshal(catalogBook, file);
        marshaller.marshal(catalogBook, System.out);

        // Считываем из файла
        Unmarshaller unmarshaller = JAXBContext.newInstance().createUnmarshaller();
        catalogBook = (Catalog) unmarshaller.unmarshal(file);
        System.out.println(catalogBook);
    }
}
