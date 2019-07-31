package XML_JSON.XML.XMLParser1;


import java.io.*;

public class XMLParser {

    private String xml;

    //В конструкторе считываем наш XML_JSON файл и записываем его в переменную String xml
    public XMLParser(String path) {
        byte[] buf = null;
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(path))){
            // RandomAccessFile, конструктор принимает 2 параметра, путь и имя файлового потока
            buf = new byte[inputStream.available()];
            inputStream.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Если не потдерживает такую кодировку то выдаст ошибку
        try {
            xml = new String(buf, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


    // Метод определения "catalog/book/author"
    public String get(String path) {
        // Разбиваем /
        String[] parts = path.split("/");
        String s_xml = xml;
//        System.out.println(s_xml);
//        System.out.println();

        for (String s : parts) {
            String toFind = "<" + s + ">";
            // start начинается с 1 символа найденного тега
            int start = s_xml.indexOf(toFind);
            if (start < 0) {
                return null;
            } else {
                start += toFind.length();
            }

            // Находим закрывающийся тег
            int end = s_xml.lastIndexOf("</" + s + ">");
            if (end < 0) {
                return null;
            }
            // Вырезаем найденную строку
            s_xml = s_xml.substring(start, end);
        }

        return s_xml;
    }
}
