package lr3;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Заполнение коллекции
        int size = 10000000;
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }

        // Испытание времени выполнения операции добавления элемента в начало коллекции
        long startTime = System.nanoTime();
        hashSet.add(-1);
        long endTime = System.nanoTime();
        System.out.println("Время добавления элемента в начало коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции добавления элемента в конец коллекции
        startTime = System.nanoTime();
        hashSet.add(size);
        endTime = System.nanoTime();
        System.out.println("Время добавления элемента в конец коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции добавления элемента в середину коллекции (не применимо для HashSet)

        // Испытание времени выполнения операции удаления элемента в начале коллекции
        startTime = System.nanoTime();
        hashSet.remove(0);
        endTime = System.nanoTime();
        System.out.println("Время удаления элемента в начале коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции удаления элемента в конце коллекции
        startTime = System.nanoTime();
        hashSet.remove(size-1);
        endTime = System.nanoTime();
        System.out.println("Время удаления элемента в конце коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции удаления элемента в середине коллекции (не применимо для HashSet)

        // Испытание времени выполнения операции получения элемента по индексу
        int indexToGet = 5000000; // Индекс элемента для получения
        startTime = System.nanoTime();
        Iterator<Integer> iterator = hashSet.iterator();
        while (indexToGet >= 0 && iterator.hasNext()) {
            int element = iterator.next();
            if (indexToGet == 0) {
                break;
            }
            indexToGet--;
        }
        endTime = System.nanoTime();
        System.out.println("Время получения элемента по индексу: " + (endTime - startTime) + " наносекунд");
    }
}
