package lr7;

import java.io.*;
import java.util.Scanner;

public class BufferedStreamExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = "example_file.txt";

        System.out.println("Введите текст для записи в файл:");
        String inputText = scanner.nextLine();

        // Запись в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(inputText);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            char[] buffer = new char[128];
            int charRead;
            String readData = "";
            while ((charRead = reader.read(buffer)) != -1) {
                readData += new String(buffer, 0, charRead);
            }
            System.out.println("Прочитанное значение: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Удаление файла
        if (new File(fileName).delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }

        scanner.close();
    }
}
