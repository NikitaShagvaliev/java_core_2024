package lr7;

import java.io.File;
import java.util.Scanner;

public class FileSizeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            System.out.println("Размер файла: " + fileSizeInBytes + " байт");
        } else {
            System.out.println("Файл не существует или это не файл!");
        }

        scanner.close();
    }
}
