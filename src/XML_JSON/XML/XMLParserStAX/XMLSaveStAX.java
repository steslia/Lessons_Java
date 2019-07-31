package XML_JSON.XML.XMLParserStAX;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XMLSaveStAX {
    public static void main(String[] args) throws XMLStreamException {
        // StAX - он идет по типу итератора, делает все последовательно
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();

        //Сдесь мы можем указать путь к файлу и записать в файл через new FileWriter
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(System.out);

        writer.writeStartDocument("1.0");
        //Создали Корневой элемент(тег)
        writer.writeStartElement("catalog");
        //Создали элемент(тег)
        writer.writeStartElement("book");
        //Создали тега book и там пишем текст
        writer.writeCharacters("TEST");
        //Создали элемент(тег)
        writer.writeStartElement("author");

        //Создали тега author и там пишем текст
        writer.writeCharacters("Bruce Eckel");

        //Сначала закрываем тег author потом book итд..
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
        //в конце закрываем документ
        writer.writeEndDocument();

        //Очищаем буфер
        writer.flush();
        //Закрываем поток
        writer.close();
    }
}
