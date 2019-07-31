package XML_JSON.XML.XMLParser2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XMLSaveDOM {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        //Создаем читый документ(Это некий буфер в памяти пока, что это не XML_JSON)
        Document document = builder.newDocument();

        //Возвращает объект класса Element, создаем корневой элемент
        Element rootElement = document.createElement("catalog");
        //Добавляем в память документа, и теперь он не пустой
        document.appendChild(rootElement);

        //Тут можно без цилка, но это я для себя чтобы меньше писать кода
        for (int i = 0; i < 2; i++) {
            //book
            Element elementBook = document.createElement("book");
            //Заносим в каталог(это будет дочерним элем каталога)
            rootElement.appendChild(elementBook);

            //Создаем теги
            Element elementAuthor = document.createElement("author");
            Element elementTitle = document.createElement("title");
            Element elementPrice = document.createElement("price");

            //Записываем в эти теги текст
            elementAuthor.setTextContent("Bruce Eckel");
            elementTitle.setTextContent("Thinking In Java 4th Edition");
            elementPrice.setTextContent("20");

            //Добавляем в тег book, теги что мы создали зарание с текстом
            elementBook.appendChild(elementAuthor);
            elementBook.appendChild(elementTitle);
            elementBook.appendChild(elementPrice);
        }

        // save
        // Трансформеры - берут данные из одного метода, трансформируют
        // по некоторому алгоритму и перекладывают в другой метод

        //Создание преобразователя
        /*TransformerFactory traF = TransformerFactory.newInstance();
        Transformer transformer = traF.newTransformer();*/

        //Или еще можно так, обявлять

        Transformer transformer = TransformerFactory.newInstance().newTransformer();

        //Создаем источник данных из документа
        DOMSource source = new DOMSource(document);
        //Создаем поток для сохранения в файл
        StreamResult streamResult = new StreamResult("C:\\Users\\Sozin\\Desktop" +
                "\\Clone git repository\\Lessons\\src\\XML_JSON\\XMLParser2\\XMLSaveDOM.xml");

        transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        //Запись, второй патамерт может быть вывод в коонсоль()
        transformer.transform(source, streamResult);
    }
}
