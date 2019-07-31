package XML_JSON.XML.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Book {
    private String authot;
    private String title;
    private int price;

    public Book(String authot, String title, int price) {
        this.authot = authot;
        this.title = title;
        this.price = price;
    }

    //Если указать анотацию без атрибута (name = ) то будет взято имя переменной для названия тега
    @XmlElement
    public void setAuthot(String authot) {
        this.authot = authot;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authot='" + authot + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getAuthot() {
        return authot;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
