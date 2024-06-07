package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = 0;

        try {
            size = scanner.nextInt();
            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным числом.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено некорректное значение для размера массива. Пожалуйста, введите целое число.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        byte[] byteArray = new byte[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент %d: ", i);
            try {
                String input = scanner.next();
                byteArray[i] = Byte.parseByte(input);
                sum += byteArray[i];
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено некорректное значение. Пожалуйста, введите число.");
                return;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введено значение за границами диапазона типа byte. Пожалуйста, введите число от -128 до 127.");
                return;
            } catch (Exception e) {
                System.out.println("Произошла неожиданная ошибка: " + e.getMessage());
                return;
            }
        }

        System.out.println("Сумма элементов массива: " + sum);
    }
}
