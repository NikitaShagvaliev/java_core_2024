package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int rows = id.nextInt();// количество строк
        int cols = id.nextInt(); // количество столбцов
        int[][] snakeArray = fillSnakePattern(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(snakeArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillSnakePattern(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int num = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = num;
                    num++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = num;
                    num++;
                }
            }
        }

        return array;
    }
}
