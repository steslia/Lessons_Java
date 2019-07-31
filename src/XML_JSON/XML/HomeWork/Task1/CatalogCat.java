package XML_JSON.XML.HomeWork.Task1;

import java.util.ArrayList;
import java.util.List;

public class CatalogCat {
    private List<Cat> catList = new ArrayList<>();

    public void add(Cat cat) {
        if (cat == null){
            throw new IllegalArgumentException("NULL");
        }
        catList.add(cat);
    }

    public List<Cat> getCatList() {
        return catList;
    }
}
