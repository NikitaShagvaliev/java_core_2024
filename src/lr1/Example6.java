package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите ваше имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите ваше отчество:");
        String middleName = scanner.nextLine();
        System.out.println("Привет, " + lastName + " " + firstName + " " + middleName);
    }
}
