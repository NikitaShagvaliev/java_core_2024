package lr7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите текст для записи в файл: ");
        String textToWrite = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(textToWrite);
            System.out.println("Количество записанных символов: " + textToWrite.length());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        scanner.close();
    }
}

