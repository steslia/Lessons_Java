package Generics;

public class GenericsMain {
    public static void main(String[] args) {

/*
        Cell<? super Toyota> cell = new Cell<Car>();
        Для того что бы указать явно что мы туда будемь ложить,
        если там ничего не будет то тогда ми сможемь положить
        любые обекты классов которые наследуються от тойоты,
        если укажем то тогда мы можемь ложить только обекты
        тех класов которые записаны в этих скобках
*/

        Cell<? super Toyota> cell = new Cell<Car>();
        cell.setT(new Toyota());
        cell.setT(new Colora());


        Cell<? extends Toyota> cell2 = new Cell<Colora>();
        Toyota t = cell2.getT();

    }
}

class Car {
    public void getCar(){}
}

class Toyota<T> extends Car {
    public void getToyota(){}
}

class Colora extends Toyota {}

class Cell<T extends Car>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}