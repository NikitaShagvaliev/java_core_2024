package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий день недели:");
        String dayOfWeek = scanner.nextLine();
        System.out.println("Введите текущий месяц:");
        String month = scanner.nextLine();
        System.out.println("Введите текущую дату:");
        int dayOfMonth = scanner.nextInt();
        System.out.println("Сегодня " + dayOfWeek + ", " + dayOfMonth + " " + month + ".");
    }
}
