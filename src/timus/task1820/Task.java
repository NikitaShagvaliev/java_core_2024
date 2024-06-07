package timus.task1820;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (k >= n) {
            System.out.println(2);
        } else {
            if ((n * 2) % k == 0) {
                System.out.println((n * 2) / k);
            } else {
                System.out.println((n * 2) / k + 1);
            }
        }
    }
}
