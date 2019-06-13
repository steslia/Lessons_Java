package Collections.StackQueue;

import java.util.Stack;

public class StackQueueLauncher {
    public static void main(String[] args) {
        passengerProcessing();

    }


    private static void passengerProcessing(){

        //Суть Stack в том, первый элемент зашел последним вышел
        Stack<Passenger> bus = new Stack<>();

        Passenger passenger = new Passenger("Lol");

        bus.push(new Passenger("Test1"));
        bus.push(new Passenger("Test2"));
        bus.push(new Passenger("Test3"));
        bus.push(passenger);
        bus.push(new Passenger("Test4"));

        //Выводим последний элемент
        System.out.println("Last passenger: " + bus.peek());

        //метод search() возвращает позицию объекта что мы передаем
        System.out.println("Passenger found ad position " + bus.search(passenger));

        //.empty() методом получаем следующий элемент
        //.pop() возвращает и удаляет элемент из колекции
        while (!bus.empty()){
            System.out.println(bus.pop());
        }
    }

    private static class Passenger{
        private String name;

        public Passenger(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Passenger " + name;
        }
    }
}
