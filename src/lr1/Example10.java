package lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш год рождения:");
        int birthYear = scanner.nextInt();

        System.out.println("Введите текущий год:");
        int currentYear = scanner.nextInt();
        int age = currentYear - birthYear;

        System.out.println("Ваш возраст: " + age + " лет.");
    }
}
