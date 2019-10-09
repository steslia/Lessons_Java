package Pattern.Creational.Builder;

//Нужен чтобы итерационо создавать объкты, чаше всего используется чтобы строит mutable object(неизминияемые объекты)
public class Main {
    public static void main(String[] args) {
        //Используем билтер, плюс в том что избавляет нас от огромный конструкторов
        Laptop laptop = new Laptop.Builder()
                .withHddCapasity(120)
                .withProcessorType(ProcessorType.AMD)
                .withScreenSize(15)
                .build();
    }
}
