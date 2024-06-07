package lr8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class ExcelParserNew {
    public static void main(String[] args) {
        String filePath = "C:/java_ex/java core 2024/src/lr8/example3.xlsx";
        FileInputStream inputStream = null;
        XSSFWorkbook workbook = null;

        try {
            // Проверка наличия файла
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл " + filePath + " не найден. Проверьте правильность пути к файлу и его наличие.");
            return;
        }

        try {
            // Создаем экземпляр книги Excel из файла
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        // Получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");
        if (sheet == null) {
            System.err.println("Ошибка: Лист 'Товары' не найден в файле. Проверьте, существует ли лист с таким названием.");
            try {
                // Закрываем файл и освобождаем ресурсы в случае ошибки
                if (workbook != null) workbook.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
                System.err.println("Ошибка при освобождении ресурсов: " + e.getMessage());
            }
            return;
        }

        // Перебираем строки и ячейки листа
        try {
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Выводим значение ячейки на экран
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Ошибка при чтении данных из листа: " + e.getMessage());
        } finally {
            try {
                // Закрываем файл и освобождаем ресурсы
                if (workbook != null) workbook.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
                System.err.println("Ошибка при освобождении ресурсов: " + e.getMessage());
            }
        }
    }
}
