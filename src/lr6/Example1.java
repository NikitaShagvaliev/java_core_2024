package lr6;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example1 {

    public static void main(String[] args) {
        // Создаем два экземпляра Runnable, представляющих задачи для потоков
        Runnable task1 = createTask("Thread-1");
        Runnable task2 = createTask("Thread-2");

        // Создаем потоки и задаем им задачи
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Запускаем потоки
        thread1.start();
        thread2.start();

        try {
            // Прерываем поток main на 10 секунд, чтобы дать потокам время выполнить работу
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Прекращаем выполнение программы (потоки прервутся естественно после main)
        System.out.println("Программа завершена.");
    }

    private static Runnable createTask(String threadName) {
        return () -> {
            while (true) {
                // Получаем текущее время
                LocalTime now = LocalTime.now();
                // Форматируем время для вывода
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                // Выводим имя потока и текущее время
                System.out.println(threadName + " - Текущее время: " + now.format(formatter));

                try {
                    // Задаем интервал в 1 секунду между выводами
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}

