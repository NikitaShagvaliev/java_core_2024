package lr7;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private double score;

    public MyClass(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Score: " + score;
    }
}

public class SerializationExample2 {
    public static void main(String[] args) {
        String fileName = "objectdata.ser";

        // Создание объекта и запись его в файл
        MyClass myObject = new MyClass("Nikita", 23, 100.5);
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(myObject);
            System.out.println("Объект был записан в файл.");

        } catch (IOException e) {
            System.out.println("Ошибка при записи объекта: " + e.getMessage());
        }

        // Восстановление объекта из файла
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            MyClass restoredObject = (MyClass) objectIn.readObject();
            System.out.println("Объект был восстановлен из файла.");
            System.out.println("Данные объекта: " + restoredObject);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при восстановлении объекта: " + e.getMessage());
        }
    }
}
