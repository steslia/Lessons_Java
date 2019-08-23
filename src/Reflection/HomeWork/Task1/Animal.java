package Reflection.HomeWork.Task1;

import java.lang.reflect.Field;

public class Animal {
    private String name;
    protected int age;
    public String region;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", region='" + region + '\'' +
                '}';
    }
}

class Cat {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Animal animal = new Animal();
        Class<?> classOne = Animal.class;
        Field[] fields = classOne.getDeclaredFields();

        for (Field field : fields){
            field.setAccessible(true);
            if (field.getType().toString().equals("int")){
                field.set(animal, 10);
            } else if (field.getName().equals("name")){
                field.set(animal, "Cote");
            } else {
                field.set(animal, "Ukrain");
            }
        }

        System.out.println(animal);
    }
}
