package HomeTaskOOP.ThreeLessons;

public class Main {
    public static void main(String[] args) {

        Group group = new Group();

        Human human = new Human("170","90","Men");

        Student student = new Student("Serg","T","3","A","170","80","Men");
        Student student1 = new Student("Serg","B","3","A","170","80","Men");
        Student student2 = new Student("Serg","V","3","A","170","80","Men");
        Student student3 = new Student("Serg","A","3","A","170","80","Men");
        Student student4 = new Student("Serg","C","3","A","170","80","Men");
        Student student5 = new Student("Serg","C","3","A","170","80","Men");
        Student student6 = new Student("Serg","C","3","A","170","80","Men");
        Student student7 = new Student("Serg","C","3","A","170","80","Men");
        Student student8 = new Student("Serg","C","3","A","170","80","Men");
        Student student9 = new Student("Serg","G","3","A","170","80","Men");
        Student student10 = new Student("Serg","G","3","A","170","80","Men");

        
        student.goString();

        Group.addStudent(student);
        Group.addStudent(student1);
        Group.addStudent(student2);
        Group.addStudent(student3);
        Group.addStudent(student4);
        Group.addStudent(student5);
        Group.addStudent(student6);
        Group.addStudent(student7);
        Group.addStudent(student8);
        Group.addStudent(student9);
        Group.addStudent(student9);

        //Выводим список студентов в алфавитном порядке
        group.goString();
    }
}
