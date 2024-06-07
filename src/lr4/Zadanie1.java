package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = null;

        try {
            System.out.print("Введите количество элементов массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным числом.");
            }

            numbers = new int[size];

            System.out.println("Введите элементы массива (целые числа): ");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение. Пожалуйста, введите целое число.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Произошла неожиданная ошибка: " + e.getMessage());
            return;
        }

        try {
            double average = calculateAveragePositive(numbers);
            System.out.println("Среднее значение среди положительных элементов: " + average);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double calculateAveragePositive(int[] numbers) {
        int sum = 0;
        int count = 0;

        for (int num : numbers) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0) {
            throw new RuntimeException("Нет положительных элементов в массиве.");
        }

        return (double) sum / count;
    }
}
