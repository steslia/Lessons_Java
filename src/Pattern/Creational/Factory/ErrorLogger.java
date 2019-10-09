package Pattern.Creational.Factory;

public class ErrorLogger implements Factory {
    @Override
    public void logMessage(String msg) {
        System.out.println("Error logger: " + msg);
    }
}