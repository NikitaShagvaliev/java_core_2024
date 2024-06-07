package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n < threshold) // Фильтруем числа, которые меньше threshold
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(10, 20, 3, 15, 7, 30, 25, 5);
        int threshold = 20;

        List<Integer> result = filterNumbersLessThan(inputNumbers, threshold);

        System.out.println("Числа, которые меньше " + threshold + ": " + result);
    }
}
