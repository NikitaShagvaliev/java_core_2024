package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Введите ваш год рождения:");
        int birthYear = scanner.nextInt();

        System.out.println("Введите текущий год:");
        int currentYear = scanner.nextInt();
        int age = currentYear - birthYear;

        System.out.println("Привет, " + name + "! Ваш возраст: " + age + " лет.");
    }
}
