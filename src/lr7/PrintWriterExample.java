package lr7;

import java.io.*;
import java.util.Scanner;

public class PrintWriterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя выходного файла: ");
        String outputFileName = scanner.nextLine();

        try (PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {
            System.out.println("Введите строки для записи в файл (введите 'exit' для завершения ввода):");

            while (true) {
                String inputLine = scanner.nextLine();
                if ("exit".equalsIgnoreCase(inputLine)) {
                    break;
                }
                printWriter.println(inputLine.toUpperCase());
            }

            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных: " + e.getMessage());
        }
    }
}
