package LessonsOOP.Polimorfizm;

class Main {
    public static void main(String[] args) {

        Crow crow = new Crow();
        Bird ostrich = new Ostrich();

        //Создаем обект
        Test test = new Test();


        //Вызываем метод объекта, он такой же как и tet(), и делаем вызов методов из других классов
        test.foo(crow);
        test.foo(ostrich);

        tet(crow);
        tet(ostrich);

    }

    //Передаем тип класса в свойство параметра, в зависимоти какой объект пришол в метод в качестве параметра
    //У такого объекта и будет вызван метод walk()
    //В качестве параметра указан тип Bird но мы передаем объект с типом Crow, програма не выдаст ошибку и нормально
    //будет работать из-за того что Crow евляеться наследником Bird, и тип автоматически приведеться к Bird.
    //так же будет с интерфейсами
    public static void tet(Bird bird) {
        bird.walk();

        //В данном случаи объект который мы передаем в метод он и если он не типа Bird а на следник
        // он автоматически приводиться, и условие тут выдаст false, а вот если указать сравнение
        // на основе класса Ostrich, вот у это объекта тип Bird и тогда в данном условии выдать true
        if (bird instanceof Crow){
            System.out.println("Hello crow");
        }else {
            System.out.println("lol");
        }
    }
}
