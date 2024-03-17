package lr2;

class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Подкласс Dog
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Собака лает");
    }
}

// Подкласс Cat
class Cat extends Animal {
    String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    public void meow() {
        System.out.println("Кошка мяукает");
    }
}

// Подкласс Bird
class Bird extends Animal {
    boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void chirp() {
        System.out.println("Птица чирикает");
    }
}

public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2, "Сухой корм");
        Bird bird = new Bird("Попугай", 1, true);

        dog.makeSound();
        dog.bark();

        cat.makeSound();
        cat.meow();

        bird.makeSound();
        bird.chirp();

    }
}