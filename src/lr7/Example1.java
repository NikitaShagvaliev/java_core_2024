package lr7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя папки: ");
        String folderName = scanner.nextLine();

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        // Создание папки
        File folder = new File("src/lr7/example1/" + folderName);
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Папка создана: " +
                        folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " +
                        folder.getAbsolutePath());
            }
        } else {
            System.out.println("Папка уже существует: " +
                    folder.getAbsolutePath());
        }

        // Создание файла внутри папки
        File file = new File(folder.getAbsolutePath() +
                File.separator + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать файл: " +
                        file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        // Удаление файла и папки
        if (file.delete()) {
            System.out.println("Файл удален: " + file.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить файл: " +
                    file.getAbsolutePath());
        }
        if (folder.delete()) {
            System.out.println("Папка удалена: " +
                    folder.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить папку: " + folder.getAbsolutePath());
        }

        scanner.close();
    }
}