package lr3;

import java.util.HashMap;

public class HashMapOperations {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");
        hashMap.put(4, "JavaScript");
        hashMap.put(5, "PHP");
        hashMap.put(6, "Ruby");
        hashMap.put(7, "Swift");
        hashMap.put(8, "Kotlin");
        hashMap.put(9, "Scala");
        hashMap.put(10, "C#");

        System.out.println("Строки с ключами больше 5:");
        for (Integer key : hashMap.keySet()) {
            if (key > 5) {
                System.out.println(hashMap.get(key));
            }
        }

        System.out.print("nСтроки с ключом 0 через запятую: ");
        if (hashMap.containsKey(0)) {
            String value = hashMap.get(0);
            System.out.print(value);
            for (Integer key : hashMap.keySet()) {
                if (key != 0 && key < 5) {
                    System.out.print(", " + hashMap.get(key));
                }
            }
        }

        int product = 1;
        for (String value : hashMap.values()) {
            if (value.length() > 5) {
                product *= value.length();
            }
        }
        System.out.println("nПроизведение ключей, где длина строки > 5: " + product);
    }
}
