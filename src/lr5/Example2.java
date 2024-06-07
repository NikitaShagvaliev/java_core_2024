package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static int[] intersect(int[] array1, int[] array2) {
        List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());

        List<Integer> intersection = list1.stream()
                .filter(list2::contains)
                .distinct()
                .collect(Collectors.toList());

        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] result = intersect(array1, array2);

        System.out.println("Результирующий массив: " + Arrays.toString(result));
    }
}

