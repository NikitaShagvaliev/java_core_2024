package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength) // Фильтруем строки, длина которых больше minLength
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList("Hello", "world", "Java", "Stream", "API", "Example");
        int minLength = 4;

        List<String> result = filterStringsByLength(inputStrings, minLength);

        System.out.println("Строки, длина которых больше " + minLength + ": " + result);
    }
}

