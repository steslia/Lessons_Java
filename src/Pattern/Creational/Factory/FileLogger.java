package Pattern.Creational.Factory;

public class FileLogger implements Factory {
    @Override
    public void logMessage(String msg) {
        System.out.println("File logger: " + msg);
    }
}