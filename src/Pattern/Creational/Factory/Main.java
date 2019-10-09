package Pattern.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();

        //Поле объявляем типом интерфейса и за этим интерфейсом скрываем внутрению реализацию,
        // но для пользователя эти объекты будто однотипные могут быть
        // он не вникает во внутрению реализацилю объектов
        Factory logger = factory.getLogger(LoggerType.CONSOLE);
        logger.logMessage("test");

        logger = factory.getLogger(LoggerType.FILE);
        logger.logMessage("test");
    }
}
