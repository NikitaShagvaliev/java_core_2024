package lr5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Example1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] evenNumbers = filterEvenNumbers(numbers);
        System.out.println(Arrays.toString(evenNumbers));
    }

    public static int[] filterEvenNumbers(int[] numbers) {
        return IntStream.of(numbers).
                filter(n -> n % 2 == 0). // Фильтрация четных чисел
                        toArray();
    }
}