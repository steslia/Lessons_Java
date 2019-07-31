package XML_JSON.XML.HomeWork.Task1;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateXML {
    public static void main(String[] args) throws IOException, XMLStreamException {
        CatalogCat catalogCat = new CatalogCat();
        catalogCat.add(new Cat("Marsel", 6, "Sphynx", 6));
        catalogCat.add(new Cat("Myrzik", 5, "Oriental", 4));

        String fileXML = createFileXML();
        contentXMLFile(catalogCat,fileXML);
    }


    private static void contentXMLFile(CatalogCat catalogCat,String fileXML) throws XMLStreamException, IOException {

        XMLStreamWriter writerXML = XMLOutputFactory.newInstance().createXMLStreamWriter(new FileWriter(fileXML));

        writerXML.writeStartDocument("UTF-8","1.0");
        writerXML.writeStartElement("animal");

        for (int i = 0; i < catalogCat.getCatList().size(); i++) {

            Cat cat = catalogCat.getCatList().get(i);

            String name = cat.getName();
            String age = String.valueOf(cat.getAge());
            String breed = cat.getBreed();
            String weight = String.valueOf(cat.getWeight());

            writerXML.writeStartElement("cat");

            writerXML.writeStartElement("name");
            //Записываем в теги текст
            writerXML.writeCharacters(name);

            //Закрываем этот тег
            writerXML.writeEndElement();

            writerXML.writeStartElement("age");
            writerXML.writeCharacters(age);
            writerXML.writeEndElement();

            writerXML.writeStartElement("breed");
            writerXML.writeCharacters(breed);
            writerXML.writeEndElement();

            writerXML.writeStartElement("weight");
            writerXML.writeCharacters(weight);
            writerXML.writeEndElement();

            //Закрываем тег cat
            writerXML.writeEndElement();
        }

        writerXML.writeEndElement();
        //Закрываем документ
        writerXML.writeEndDocument();

        writerXML.close();
    }

    private static String createFileXML() {
        File newFile = new File("C:\\Users\\Sozin\\Desktop\\Clone git repository\\Lessons\\src" +
                "\\XML_JSON\\HomeWork\\Task1\\Cat.xml");

        String file = "C:\\Users\\Sozin\\Desktop\\Clone git repository\\Lessons\\src" +
                "\\XML_JSON\\HomeWork\\Task1\\Cat.xml";
        //Создание нового файла с розширением XML_JSON
        try {
            boolean create = newFile.createNewFile();
            if (create){
                System.out.println("Create new File");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }
}
