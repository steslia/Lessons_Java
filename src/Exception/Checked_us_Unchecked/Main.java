package Exception.Checked_us_Unchecked;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    //Добавляем изключение в сигнатуру главного метода
    //И обрабатываем такие исключения в верх по иерархии метода
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        PrintWriter writer = null;
        do {
            try {
                System.out.println("Please enter numerator!");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator!");
                int denominator = scanner.nextInt();
                System.out.println(divide(numerator, denominator));
                writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("Result = "+divide(numerator, denominator));
                continueLoop = false;

            }
/*            catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception " + e);
                scanner.nextLine();
                System.out.println("Параметр int для деления не должен быть 0");
            } catch (IOException e) {
                System.out.println("Файл открыт");
                e.printStackTrace();
            } */
            finally {
                //В этот блок помешаем код который обезательно должен выполница
                //В этом блоке код выполнитца даже если блок try выполнился не успешно
                System.out.println("Finally блок запустился");
                writer.close();

            }
        } while (continueLoop);
    }

    //Декларируем что метод выбрасывает Exception
    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }
}
