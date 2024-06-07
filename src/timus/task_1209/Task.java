package timus.task_1209;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        for (long i = 0; i < n; i++) {
            long x = scanner.nextLong() - 1;
            long y = (long) Math.sqrt(8 * x + 1);
            if (y * y == (8 * x + 1)) {
                System.out.println("1 ");
            } else System.out.println("0 ");
        }
    }
}
