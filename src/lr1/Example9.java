package lr1;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца:");
        String monthName = scanner.nextLine();
        System.out.println("Введите количество дней в этом месяце:");
        int days = scanner.nextInt();
        System.out.println("Месяц " + monthName + " содержит " + days + " дней.");
    }
}
