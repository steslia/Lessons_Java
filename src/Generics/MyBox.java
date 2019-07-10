package Generics;

public class MyBox<E> {
    E element;

    //Конструктор может быть с другим типом но область видимости
    //этого типа только метод и вне метода мы не можем создавать поля
    public <T> MyBox (T param){
        System.out.println(param);
    }
}
