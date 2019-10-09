package Pattern.Creational.Factory;

public class LoggerFactory {
    public Factory getLogger(LoggerType type) {
        Factory res = null;
        switch (type) {
            case FILE:
                res = new FileLogger();
                break;
            case CONSOLE:
                res = new ConsoleLogger();
                break;
            case ERROR:
                res = new ErrorLogger();
                break;
        }
        return res;
    }
}
