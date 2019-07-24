package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id=" + id
                + ", Name= '" + name + "'"
                + ", Salary= " + salary;
    }
}

public class StreamsOverviewMain {
    private static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        employeeList.add(new Employee(1, "Serg", 500000));
        employeeList.add(new Employee(3, "Ann", 15000));
        employeeList.add(new Employee(4, "Alex", 12000));
        employeeList.add(new Employee(6, "Max", 100000));
        employeeList.add(new Employee(2, "Igor", 800000));
        employeeList.add(new Employee(7, "Sara", 900000));
        employeeList.add(new Employee(10, "Ser", 700000));
        employeeList.add(new Employee(16, "Lover", 600000));
        employeeList.add(new Employee(19, "Mark", 5000));

        testSortStream();
    }

    private static void testSortStream() {
        //Подсчитывает максималную зарплату и записывает этот объект в переменную
        Employee employee = employeeList.stream()
                .max((s1, s2) -> s1.getSalary() - s2.getSalary())
                .get();
        System.out.println(employee);
        System.out.println();

        //Сортируем стрим по  id, потом преобразует в спимок,
        employeeList.stream()
                .sorted((e1, e2) -> e1.getId() - e2.getId())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Optional<Employee> max = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(max.get().getSalary());

        Employee identity = new Employee(0, "Sum", 0);
        Employee reduce = employeeList.stream()
                .reduce(identity, (e1, e2) -> {
                    e1.setId(e1.getId() + e2.getId());
                    e1.setSalary(e1.getSalary() + e2.getSalary());
                    return e1;
                });

        System.out.println("Sum id = " + reduce.getId() + ", Sum salary = " + reduce.getSalary());
    }
}
