package HomeTaskOOP.ThreeLessons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Group group = new Group();

        Human human = new Human("170","90","Men");
        Student student = new Student("Serg","T","3","A","170","80","Men");
        Student student1 = new Student("Serg","B","3","A","170","80","Men");
        Student student2 = new Student("Serg","V","3","A","170","80","Men");
        Student student3 = new Student("Serg","A","3","A","170","80","Men");
        Student student4 = new Student("Serg","C","3","A","170","80","Men");

        student.goString();

        Group.addStudent(student);
        Group.addStudent(student1);
        Group.addStudent(student2);
        Group.addStudent(student2);
        Group.addStudent(student3);
        Group.addStudent(student4);

        Group.inputArrayGroup();

        group.goString();
    }
}
