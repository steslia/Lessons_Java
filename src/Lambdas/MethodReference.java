package Lambdas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class MethodReference {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //1. Ссылка на статичский метод
        // Math::max // эквивалентно (x, y) -> Math.max(x, y)
        ToIntFunction<String> intParser = Integer::parseInt;
        intParser.applyAsInt("10");

        //2. Ссылка на метод с помощью имеющейся ссылки на объект(Ссылаться через объект, а не через класс)
        //Ссылаемся на не статический метод указывая объект.
        // System.out::println // эквивалентно x -> System.out:println(x)
        Consumer<String> printer = System.out::println;

        LambdaExample lambdaExample = new LambdaExample();
        Consumer<String> printer1 = lambdaExample::test;

        //3. Вывозов метода экземпляра от имени ссылки на объект, предоставляемой контекстом
        // Еще один способ сослаться на не статический метод, но тут немного другой синтаксис
        //
        //String::length // эквивалентно x -> x.length()
        //String:compareTo // эквивалентно (x, y) -> x.compareTo(y)
        Function<Object, String> objectToString = Object::toString;
        Comparator<Double> doubleComparator = Comparator.comparing(Math::abs, Double::compare);

        //4. Вызов конструктора
        //ArrayList::new // эквивалентно x -> new ArrayList()
        //В метод arrayAllocator будет создан и передан массив строк
        IntFunction<String[]> arrayAllocator = String[]::new;

    }
}
