package Pattern.Creational.AbstractFactory;

public class JsonHttpFactory extends AbstractFactory {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }

    @Override
    public Sender createSender() {
        return new HttpSender();
    }
}
