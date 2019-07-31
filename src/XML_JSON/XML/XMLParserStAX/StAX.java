package XML_JSON.XML.XMLParserStAX;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StAX {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        final String FILE_NAME = "C:\\Users\\Sozin\\Desktop\\Clone git repository\\Lessons\\src\\XML_JSON\\XMLParserSAX\\SAX.xml";
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parse = factory.createXMLStreamReader(new FileInputStream(FILE_NAME));

        //StAX работает по принципу итераций здесь мы получаем следующий элемент и если он являеться
        while (parse.hasNext()){
            int event = parse.next();
            if (event == XMLStreamConstants.START_ELEMENT){
                System.out.println(parse.getLocalName());
            }
        }
    }
}
