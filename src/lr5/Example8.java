package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold) // Фильтруем числа, которые больше threshold
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int threshold = 5;

        List<Integer> result = filterNumbersGreaterThan(inputNumbers, threshold);

        System.out.println("Числа, которые больше " + threshold + ": " + result);
    }
}
