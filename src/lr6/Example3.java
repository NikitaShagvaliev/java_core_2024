package lr6;

public class Example3 {

    public static void main(String[] args) {
        // Создаем первое задание, которое выводит четные числа
        Runnable evenTask = () -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Четное число: " + i);
                }

                try {
                    // Задаем задержку в 500 миллисекунд между выводами
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Создаем второе задание, которое выводит нечетные числа
        Runnable oddTask = () -> {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Нечетное число: " + i);
                }

                try {
                    // Задаем задержку в 500 миллисекунд между выводами
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Создаем потоки для четных и нечетных чисел
        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        // Запускаем потоки
        evenThread.start();
        oddThread.start();

        try {
            // Дожидаемся завершения обоих потоков
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Оба потока завершены.");
    }
}

