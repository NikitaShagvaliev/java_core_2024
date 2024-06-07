package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static List<String> filterStringsStartingWithUppercase(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList(
                "Hello", "world", "Java", "Stream", "api", "Example");

        List<String> result = filterStringsStartingWithUppercase(inputStrings);

        System.out.println("Отфильтрованные строки: " + result);
    }
}
