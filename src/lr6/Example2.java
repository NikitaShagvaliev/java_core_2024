package lr6;

public class Example2 {

    public static void main(String[] args) {
        // Создаем экземпляр Runnable, представляющий задачу для потока
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);

                try {
                    // Задаем задержку в 1 секунду между выводами
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Создаем поток и задаем ему задачу
        Thread thread = new Thread(task);

        // Запускаем поток
        thread.start();

        try {
            // Дожидаемся завершения потока
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток завершен.");
    }
}
