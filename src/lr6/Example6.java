package lr6;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class Example6 {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9, 7, 9, 3};
        int sum = parallelSum(array);
        System.out.println("Сумма элементов в массиве: " + sum);
    }

    public static int parallelSum(int[] array) {
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        return pool.invoke(new SumTask(array, 0, array.length));
    }

    private static class SumTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start, end;
        private static final int THRESHOLD = 1000; // порог для прямого вычисления

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= THRESHOLD) {
                // Прямое вычисление для небольших задач
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                // Разбиваем задачу на две подзадачи
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);
                invokeAll(leftTask, rightTask);
                return leftTask.join() + rightTask.join();
            }
        }
    }
}
