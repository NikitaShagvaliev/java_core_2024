package timus.task_1025;

import java.util.*;

public class Task{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < n; ++i) {
            int bb = scanner.nextInt();
            numbers.add(bb);
        }
        Collections.sort(numbers);
        for (int i = 0; i <= numbers.size() / 2; ++i) {
            k += (numbers.get(i) / 2) + 1;
        }
        System.out.println(k);
    }
}