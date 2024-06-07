package timus.task_1639;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int result = (m * n) % 2;

        out.println((result != 0) ? ("[second]=:]") : ("[:=[first]"));
        out.flush();
    }
}
