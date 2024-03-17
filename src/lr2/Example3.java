package lr2;
import java.util.Random;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        int size = id.nextInt();// размер массива
        int[] nums = new int[size]; // создание массива

        // заполнение массива случайными числами и вывод в консоль
        System.out.println("Массив случайных чисел:");
        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(200); // случайное число от 0 до 99
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

        // определение элемента с минимальным значением
        int min = nums[0];
        for (int i = 1; i < size; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        // вывод индексов элементов с минимальным значением
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.print("Индексы элементов с минимальным значением: ");
        for (int i = 0; i < size; i++) {
            if (nums[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
