package lr3;

import java.util.Scanner;

public class RecursiveArrayInputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        fillArray(array, 0);

        System.out.println("nВведенный массив:");
        displayArray(array, 0);

        scanner.close();
    }

    public static void fillArray(int[] array, int index) {
        if (index < array.length) {
            Scanner scanner = new Scanner(System.in);
            array[index] = scanner.nextInt();
            fillArray(array, index + 1);
            scanner.close();
        }
    }

    public static void displayArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            displayArray(array, index + 1);
        }
    }
}
