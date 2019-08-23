package XML_JSON.JSON.Jackson.entity;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Course course;
    private List<String> personalContacts;

    //Есл есть конструктор с параетрами должен быть и пустой конструктор ибо будет кидать ошибки
    public Person() {
    }

    public Person(String firstName, String lastName, Course course, List<String> personalContacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.personalContacts = personalContacts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Course getCourse() {
        return course;
    }

    public List<String> getPersonalContacts() {
        return personalContacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", personalContacts=" + personalContacts +
                '}';
    }
}
