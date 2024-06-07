package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static List<String> filterStringsContainingSubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList(
                "Hello", "world", "Java", "Stream", "API", "Example");
        String substring = "am";

        List<String> result = filterStringsContainingSubstring(inputStrings, substring);

        System.out.println("Строки, содержащие подстроку: " + result);
    }
}

