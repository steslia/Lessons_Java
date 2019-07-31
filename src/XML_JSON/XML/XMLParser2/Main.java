package XML_JSON.XML.XMLParser2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //Создать объект класса — DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //Получаем объект DocumentBuilder. На его основе нужно создать парсер для документа -  DocumentBuilder
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Парсим объект DocumentBuilder и получаем объект Document
        Document document = builder.parse("C:\\Users\\Sozin\\Desktop" +
                "\\Clone git repository\\Lessons\\src\\XML_JSON\\XMLParser2\\1.xml");

        // Возвращает объект класса Element, получаем корневой элемент XML_JSON
        Element element = document.getDocumentElement();
        System.out.println("Корневой элемент: " + element.getNodeName());

        //Для корневого элемента вызываем метод getChildNodes.Для получения всех его наследников(детей)
        //они записываються в массив
        NodeList nodeList = element.getChildNodes();

        //Проходимся по всем дочерним элементам(по массиву этих элементов)
        for (int i = 0; i < nodeList.getLength(); i++) {

            //По номеру получаем узел
            Node node = nodeList.item(i);

            //Проверяем определенный тип, если узел является элементом, то входим в тело
            if (node.getNodeType() == Node.ELEMENT_NODE) {

                //Полученный узел заносив в перемунную. Если это Элемент,
                //и после получем содержимое внутри нужных нам тегов
                Element elementNode = (Element) node;
                System.out.println("Book:");
                System.out.println("Authors: " + elementNode.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("Title: " + elementNode.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
            }
        }
    }

}
