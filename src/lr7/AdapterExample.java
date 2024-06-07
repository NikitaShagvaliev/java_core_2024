package lr7;

import java.io.*;
import java.util.Scanner;

public class AdapterExample {
    public static void main(String[] args) {
        String outputFileName = "C:/java_ex/java core 2024/src/lr7/output.txt";

        try (OutputStream outputStream = new FileOutputStream(outputFileName);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            Scanner scanner = new Scanner(System.in, "UTF-8");
            System.out.println("Введите текст для записи в файл (для завершения введите 'exit'):");

            while (true) {
                String line = scanner.nextLine();
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }

            System.out.println("Данные записаны в файл: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
