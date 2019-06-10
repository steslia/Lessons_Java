package Collections.ArrayList;

import java.util.Scanner;

public class ListRunner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        printOut();
        int param = scanner.nextInt();
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("Введите текст для добавления");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    list.addToList(task1);
                    System.out.println("Выберите следующуе действие [0-6]");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Список To Do List");
                    list.printToDoList();
                    System.out.println("Выберите следующуе действие [0-6]");
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Введите элемент для замены");
                    scanner.nextLine();
                    System.out.println("Введите индекс ");
                    int i = scanner.nextInt();
                    System.out.println("Введите элемент который хотите заменить");
                    scanner.nextLine();
                    String task3 = scanner.nextLine();
                    list.changeTask(i, task3);
                    scanner.nextLine();
                    System.out.println("Выберите следующуе действие [0-6]");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Выберите следующуе действие [0-6]");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Удаление элемента, введите элем который хотите удалить");
                    scanner.nextLine();
                    String task5 = scanner.nextLine();
                    list.removeToDoList(task5);
                    System.out.println("Выберите следующуе действие [0-6]");
                    param = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Введите названия элемента для получения его индекса");
                    scanner.nextLine();
                    String task6 = scanner.nextLine();
                    list.getIndexToDoList(task6);
                    System.out.println("Выберите следующуе действие [0-6]");
                    param = scanner.nextInt();
                    break;
                default:
                    param = 0;
            }
        }
        System.out.println("Конец программы");


    }

    private static void printOut() {
        System.out.println("Пожалуйста выберете дествие: \n"
                + "1. Добавить новый элемент в список \n"
                + "2. Вывести список \n"
                + "3. Добавить новый элемент в список \n"
                + "4. Добавить новый элемент в список \n"
                + "5. Добавить новый элемент в список \n"
                + "6. Добавить новый элемент в список \n"
                + "0. Добавить новый элемент в список \n");
    }
}
