package XML_JSON.XML.XMLParser1;

class XMLMain {
    public static void main(String[] args) {

        // Считываем файл.xml
        XMLParser xml = new XMLParser("C:\\Users\\Sozin\\Desktop\\Clone git repository" +
                "\\Lessons\\src\\XML_JSON\\XMLParser1\\2.xml");

        // Указываем путь, что будем считывать с файла xml
        String value = xml.get("catalog/book/author");
        System.out.println(value);
    }
}
