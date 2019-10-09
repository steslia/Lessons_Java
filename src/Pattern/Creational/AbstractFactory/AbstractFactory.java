package Pattern.Creational.AbstractFactory;

//Отличие от обычной фабрики, в том что создает все объекты
// они могут быть разнотипные для выполнения определенного сценария
public abstract class AbstractFactory {
    public abstract Message createMessage();
    public abstract Sender createSender();
}
