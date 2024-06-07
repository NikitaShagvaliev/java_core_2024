package lr3;

import java.util.Scanner;
public class DecimalToBinaryRecursive {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число для перевода в двоичную систему: ");
            int decimal = scanner.nextInt();
            scanner.close();

            String binary = decimalToBinary(decimal);

            System.out.println("Число " + decimal + " в двоичной системе счисления: " + binary);
        }

        public static String decimalToBinary(int num) {
            if (num == 0) {
                return "0";
            } else if (num == 1) {
                return "1";
            } else {
                int remainder = num % 2;
                int quotient = num / 2;
                return decimalToBinary(quotient) + remainder;
            }
        }
}

