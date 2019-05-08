package HomeTaskOOP.ThreeLessons;

public class Student extends Human {

    String name;
    String surname;
    String course;
    String progress;

    Student(String name, String surname, String course, String progress, String height, String weight, String sex) {
        super(height, weight, sex);
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.progress = progress;
    }

    @Override
    public void goString() {
        System.out.println("name: " + name + "\n" +
                "surname: " + surname + '\n' +
                "course: " + course + '\n' +
                "progress: " + progress
        );
        super.goString();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCourse() {
        return course;
    }

    public String getProgress() {
        return progress;
    }
}
