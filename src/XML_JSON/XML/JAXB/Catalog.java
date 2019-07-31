package XML_JSON.XML.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "catalog")
public class Catalog {

    @XmlElement(name = "book")
    private List<Book> list = new ArrayList<>();

    public void add(Book book){
        list.add(book);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(list.toArray());
    }
}
