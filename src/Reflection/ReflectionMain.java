package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //Способы получения классы экземпляра, через рефлексию
        TestClassReflection reflection = new TestClassReflection();

        //1. .class
        Class<?> classOne = TestClassReflection.class;

        //2. .getClass()
        Class<?> classTwo = reflection.getClass();

        //3. Указываем пакет и имя класса
        Class<?> classThree = Class.forName("Reflection.TestClassReflection");

        //Создание класса через рефлексию
        TestClassReflection testClass = (TestClassReflection) classOne.newInstance();

        //Получаем суперкласс через рефлексию. Можно получмть, так и так.
        Class<?> superClass = classOne.getSuperclass();
        Class<?> superClass1 = reflection.getClass().getSuperclass();

        System.out.println(superClass.getName());

        //Получаем поля класса
        Field field = classOne.getDeclaredField("str");
        field.setAccessible(true);
        System.out.println(field.get(reflection));

        //Устанавливаем новое значение и выводим новое значение
        field.set(reflection, "New text...");
        System.out.println(field.get(reflection));

        //Получаем доступ к приватному полю и меняем его значение через публичный конструктор
        Class<?> paramTypes = int.class;
        Constructor<?> ctr = classOne.getConstructor(paramTypes);
        TestClassReflection cm = (TestClassReflection) ctr.newInstance(100);
        System.out.println("Новое установленое значение: " + cm.getNumber());

    }

}

class TestClassReflection{
    private String str = "String Test Text";
    private int number;

    public TestClassReflection() {
    }

    public TestClassReflection(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
