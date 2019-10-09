package Pattern.Creational.Factory;

public class ConsoleLogger implements Factory {
    @Override
    public void logMessage(String msg) {
        System.out.println("Console logger: " + msg);
    }
}
