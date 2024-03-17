package lr2;

public class Person {
    // Поля класса
    private String name;
    private int age;
    private String gender;

    // Конструктор класса
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Метод для установки имени
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения имени
    public String getName() {
        return name;
    }

    // Метод для установки возраста
    public void setAge(int age) {
        this.age = age;
    }

    // Метод для получения возраста
    public int getAge() {
        return age;
    }

    // Метод для установки пола
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Метод для получения пола
    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        // Создание объекта класса Person с конкретными значениями
        Person person = new Person("Alice", 30, "Female");

        // Использование методов для получения и вывода информации о человеке
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        // Изменение возраста и вывод обновленной информации
        person.setAge(31);
        System.out.println("New Age: " + person.getAge());
    }
}
