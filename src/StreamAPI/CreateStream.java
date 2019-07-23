package StreamAPI;

public class CreateStream {
    //Способы создания Stream API:
     /*
     1.Создание стрима из любой коллекции:
     Set<String> setString = ...;
     setString.stream();
     колекция.stream();

     2.Создание стрима из массива:
     Arrays.stream(массив)

     3.Создание стрима из файла (каждая строка в файле будет отдельным элементом в стриме):
     Files.lines(путь_к_файлу)
     Files.walk(путь_к_файлу)

     4.Создание стрима из строки:
     IntStream streamFromString = "123".chars()
     «строка».chars()

     5.Создания стрима из BufferedReader:
     BufferedReader reader = ...;
     Stream<String> stream = reader.lines;
     .lines

     6.Создание бесконечных стрима с помощью Stream.generate:
     Stream<String> streamFromGenerate = Stream.generate(() -> "a1")
     Stream.generate(выражение_генерации)

     7.Создание бесконечных стрима с помощью Stream.iterate:
     Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1)
     Stream.iterate(начальное_условие, выражение_генерации)

     8.Создания стрима целых чисел с указанием диапазона:
     IntStream smallIntegers = IntStream.range(0, 100); - Конец диапазона не включительно
     IntStream smallIntegers = IntStream.rangeClosed(0, 100); - Конец диапазона включительно

     9.Создание стрима из значений:
     Stream.of(значение1,… значениеN)
     IntStream streamFromValues = IntStream.of(1, 2, 5, 10, 50, 28);

     10.Создания пустого стрима:
     IntStream empty = IntStream.empty;

     11.Обеденения стримов:
     IntStream combinedStream = IntStream.concat(stream1, stream2);

     */
}
