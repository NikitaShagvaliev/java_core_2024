package timus.task_1263;

import java.util.*;
import java.text.DecimalFormat;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, t;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < m; ++i) {
            t = scanner.nextInt();
            a[t - 1]++;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < a.length; ++i) {
            System.out.println(df.format(a[i] * 100.0 / m) + "%");
        }
    }
}