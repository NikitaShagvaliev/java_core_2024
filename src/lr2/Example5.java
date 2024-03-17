package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("Введите текст для шифрования:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toUpperCase();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        scanner.nextLine(); // очистка буфера после ввода числа
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (((ch - 'A' + key) % 26) + 'A');
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key); // обратное преобразование шифра Цезаря
    }
}

