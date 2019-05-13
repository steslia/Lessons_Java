package Collections.ArrayList;

public class ListRunner {
    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.addToList("lol");
        toDoList.addToList("lol1");
        toDoList.addToList("lol2");
        toDoList.addtoListatPosition(1,"test");

        toDoList.printToDoList();
    }
}
