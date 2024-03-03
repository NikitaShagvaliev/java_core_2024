package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int number1 = number - 1;
        int number2 = number;
        int number3 = number + 1;

        int sum = number1 + number2 + number3;
        int square = sum * sum;

        System.out.println("Числа: " + number1 + ", " + number2 + ", " + number3 + ", " + square);
    }
}
