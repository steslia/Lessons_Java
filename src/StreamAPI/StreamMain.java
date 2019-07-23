package StreamAPI;

import java.io.*;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Считываем файл с консоли
        Path dir = Paths.get(reader.readLine());

        //Подсчитывает сколько строк в файле, файл считывает розсширение txt
        //Автоматически закрываем Stream, сначала его создаем в try с ресурсами
        try (Stream<Path> files = Files.walk(dir)) {
            long count = files.filter((p) -> p.toString().endsWith(".txt"))
                    .peek(System.out::println)
                    .flatMap(StreamMain::getLines)
                    .peek(System.out::println)
                    .count();
            System.out.println(count);
        }


        //Метод возведения в факториал
        System.out.println(factorial(Integer.parseInt(reader.readLine())));

    }

    //Проверку вывели в отельный метод,
    private static Stream<String> getLines(Path file) {
        try {
            return Files.lines(file);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    //Метод возведения числа в факториал через Stream API
    private static BigInteger factorial(int number) {
        return IntStream.rangeClosed(1, number)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
