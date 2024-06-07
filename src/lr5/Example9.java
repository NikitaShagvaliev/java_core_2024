package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static List<String> filterStringsContainingOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter)) // Фильтруем строки, состоящие только из букв
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList("Hello", "world123", "Java", "Stream!", "API", "Example$", "Code#", "java_program");

        List<String> result = filterStringsContainingOnlyLetters(inputStrings);

        System.out.println("Строки, содержащие только буквы: " + result);
    }
}
