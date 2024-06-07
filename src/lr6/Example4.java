package lr6;

public class Example4 {

    public static void main(String[] args) {
        // Создаем массив для хранения 10 потоков
        Thread[] threads = new Thread[10];

        // Создаем и запускаем 10 потоков
        for (int i = 0; i < 10; i++) {
            final int threadNumber = i + 1; // Номер потока (от 1 до 10)

            Runnable task = () -> {
                System.out.println("Поток номер: " + threadNumber);
            };

            threads[i] = new Thread(task);
            threads[i].start();
        }

        // Ожидаем завершения всех потоков
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Все потоки завершены.");
    }
}
