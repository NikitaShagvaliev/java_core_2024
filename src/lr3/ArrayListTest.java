package lr3;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Заполнение коллекции
        int size = 10000000;
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        // Испытание времени выполнения операции добавления элемента в начало коллекции
        long startTime = System.nanoTime();
        arrayList.add(0, -1);
        long endTime = System.nanoTime();
        System.out.println("Время добавления элемента в начало коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции добавления элемента в конец коллекции
        startTime = System.nanoTime();
        arrayList.add(size, size);
        endTime = System.nanoTime();
        System.out.println("Время добавления элемента в конец коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времения выполнения операции добавления элемента в середину коллекции
        startTime = System.nanoTime();
        int middleIndex = size / 2;
        arrayList.add(middleIndex, middleIndex);
        endTime = System.nanoTime();
        System.out.println("Время добавления элемента в середину коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции удаления элемента в начале коллекции
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("Время удаления элемента в начале коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции удаления элемента в конце коллекции
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        endTime = System.nanoTime();
        System.out.println("Время удаления элемента в конце коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции удаления элемента в середине коллекции
        startTime = System.nanoTime();
        arrayList.remove(middleIndex);
        endTime = System.nanoTime();
        System.out.println("Время удаления элемента в середине коллекции: " + (endTime - startTime) + " наносекунд");

        // Испытание времени выполнения операции получения элемента по индексу
        long elementsToGet = 10000000; // Количество элементов для получения
        startTime = System.nanoTime();
        for (long i = 0; i < elementsToGet; i++) {
            arrayList.get((int)i);
        }
        endTime = System.nanoTime();
        System.out.println("Время получения элемента по индексу: " + (endTime - startTime) + " наносекунд");
    }
}
