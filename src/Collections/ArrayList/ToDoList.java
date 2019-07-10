package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    //Создали список
    private List<String> toDoList = new ArrayList<>();

    //Метод для добавления элементов в список
    public void addToList(String task) {
        toDoList.add(task);
    }

    //Метод для добавления конкретной позиции
    //Когда добавляем через данный метод все элементы списка сдвигаются на один
    public void addtoListatPosition(int position, String task) {
        toDoList.add(position, task);
    }

    //Вывод списка через цикл
    public void printToDoList() {
        //Метод size() для определения длины
        for (int i = 0; i < toDoList.size(); i++) {
            //Метод get() возвращает элемент который заданый в данной позиции
            System.out.println(i + "-" + toDoList.get(i));
        }
    }

    //Метод для перезаписания элементов списка
    public void changeTask(int index, String task) {
        //Метод set() перезаписывает элемент списка
        toDoList.set(index, task);
    }

    //Метод для удалении элементов из списка
    public void removeToDoList(String task) {
        //remove() удаляем объект, можно удалять по названию объекта или по индексу
        //и он еще возвращает значение которое он убрал из списка

        toDoList.remove(task);
    }

    //Метод для получения индекста элемента
    public void getIndexToDoList(String task) {
        //indexOf() получаем индекс объекта
        toDoList.indexOf(task);

//        System.out.println(toDoList.indexOf(task));

    }
}
