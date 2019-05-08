package HomeTaskOOP.ThreeLessons;

import java.util.Arrays;

public class Group {

    private static Student[] groupStudens = new Student[10];

    public static void addStudent(Student student) {
        for (int i = 0; i < groupStudens.length; i++) {
            if (groupStudens[i] == null) {
                groupStudens[i] = student;
                break;
            } else if (groupStudens[groupStudens.length - 1] != null) {
                System.out.println("Group is full");
                break;
            }
        }
    }

    public static void deleteStudent(Student student) {
        for (int i = 0; i < groupStudens.length; i++) {
            if (groupStudens[i] != null) {
                groupStudens[i] = null;
                break;
            } else if (groupStudens[groupStudens.length - 1] == null) {
                System.out.println("Group is clear");
                break;
            }
        }
    }

    public static void inputArrayGroup() {
        System.out.println(Arrays.toString(groupStudens));
    }


    void goString() {
        String[] student = new String[groupStudens.length];
        int calk = 1;
        for (int i = 0; i < groupStudens.length; i++) {
            if (groupStudens[i] != null) {
                student[i] = groupStudens[i].getSurname() + " " + calk++;
            } else {
                student[i] = "";
            }
        }

        Arrays.sort(student);

        for (String sortStudent : student) {
            if (sortStudent != "") {
                System.out.println(sortStudent);
            }
        }

    }


}
