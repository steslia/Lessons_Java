package LessonsOOP.hidingMethods;

public class Cat extends Animal{

    public static void testClassMethod() {
        System.out.println("The class method" + " in Cat.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method" + " in Cat.");
    }

    /*В итоге в первом случае выведется статический метод класса Annimal
    хотя ссылка указывает на объект Cat и должен вызываться "переопределенный"
    статический метод но этого не происходит,из чего следует что метод не переопределился!
    во втором же случае с нормальным не статическим методом выведется переопределенный в Cat метод.
    А чтобы вызвать тот статический метод в нашем суб классе нужно ссылку привести к
    Cat типа ((Cat)myCat).testClassMethod() тогда выведется наш якобы "переопределенный" статический метод.
    Надеюсь теперь понятно что статический метод не переопределяется.
    Плюс я не стал писать что по нормальному обращаться к стат методам
    или полям лучше использовать имя Класса, думаю это и так ясно ))*/

    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.testClassMethod();
        myCat.testInstanceMethod();
    }
}
