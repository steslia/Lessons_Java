package XML_JSON.XML.XMLParserSAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DefaultHandler handler = new DefaultHandler(){
            boolean author = false;
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                if (qName.equalsIgnoreCase("author")) {
                    author = true;
                }
            }


            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                if (author){
                    System.out.println("Author: " + new String(ch, start, length));
                    author = false;
                }
            }
        };

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        final String FILE_NAME = "C:\\Users\\Sozin\\Desktop\\Clone git repository\\Lessons\\src\\XML_JSON\\XML\\XMLParserSAX\\SAX.xml";
        parser.parse(FILE_NAME,handler);

    }
}
