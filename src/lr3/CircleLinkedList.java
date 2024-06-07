package lr3;

import java.util.LinkedList;
import java.util.List;

public class CircleLinkedList {

    public static void main(String[] args) {
        int N = 10; // Количество человек в кругу
        List<Integer> circle = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        System.out.println("Остался человек под номером: " + circle.get(0));
    }
}
