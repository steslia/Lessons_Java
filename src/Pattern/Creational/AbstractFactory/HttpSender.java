package Pattern.Creational.AbstractFactory;

public class HttpSender implements Sender {
    @Override
    public void send(Message msg) {
        System.out.println("Sending " + msg + " via HTTP protocol");
    }
}
