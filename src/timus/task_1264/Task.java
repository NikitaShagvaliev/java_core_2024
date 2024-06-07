package timus.task_1264;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int numberOfM = m + 1;
        int result = n * numberOfM;

        System.out.println(result);
    }
}
