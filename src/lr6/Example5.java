package lr6;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class Example5 {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9, 7, 9, 3};
        int max = findMax(array);
        System.out.println("Максимальный элемент в массиве: " + max);
    }

    public static int findMax(int[] array) {
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        return pool.invoke(new MaxTask(array, 0, array.length));
    }

    private static class MaxTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start, end;
        private static final int THRESHOLD = 1000; // порог для прямого вычисления

        public MaxTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= THRESHOLD) {
                // Прямое вычисление для небольших задач
                int max = Integer.MIN_VALUE;
                for (int i = start; i < end; i++) {
                    max = Math.max(max, array[i]);
                }
                return max;
            } else {
                // Разбиваем задачу на две подзадачи
                int mid = (start + end) / 2;
                MaxTask leftTask = new MaxTask(array, start, mid);
                MaxTask rightTask = new MaxTask(array, mid, end);
                invokeAll(leftTask, rightTask);
                return Math.max(leftTask.join(), rightTask.join());
            }
        }
    }
}

