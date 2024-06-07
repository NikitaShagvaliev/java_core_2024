package timus.task_1787;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();

        int left = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            left = left + x - k;
            if (left < 0) {
                left = 0;
            }
        }
        System.out.println(left);
    }
}
