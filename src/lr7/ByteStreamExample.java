package lr7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считывание данных для записи с консоли
        System.out.println("Введите данные для записи в файл:");
        String data = scanner.nextLine();

        // Установка пути к файлу
        String fileName = "C:/java_ex/java core 2024/src/lr7/example_file.txt";
        File file = new File(fileName);

        // Создание директорий, если они не существуют
        file.getParentFile().mkdirs();

        // Запись данных в файл
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(data.getBytes());
            System.out.println("Данные записаны в файл: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение данных из файла
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Удаление файла
        if (file.delete()) {
            System.out.println("Файл удален: " + file.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
        }

        scanner.close();
    }
}
