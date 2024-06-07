package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        Scanner scanner = new Scanner(System.in);
        int columnIndex;

        try {
            System.out.print("Введите номер столбца (начиная с 0): ");
            columnIndex = scanner.nextInt();

            if (columnIndex < 0 || columnIndex >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Номер столбца выходит за допустимые пределы.");
            }

            System.out.println("Элементы столбца номер " + columnIndex + ":");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][columnIndex]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение. Пожалуйста, введите целое число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла неожиданная ошибка: " + e.getMessage());
        }
    }
}

