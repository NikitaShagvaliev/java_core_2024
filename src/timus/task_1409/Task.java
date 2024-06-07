package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int numberOfCuns = a + b - 1;

        int harry = numberOfCuns - a;
        int larry = numberOfCuns - b;

        out.println(harry + " " + larry);
        out.flush();
    }
}
