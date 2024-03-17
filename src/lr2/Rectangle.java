package lr2;

public class Rectangle {
    // Поля класса
    private double length;
    private double width;

    // Конструктор класса
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Метод для установки длины
    public void setLength(double length) {
        this.length = length;
    }

    // Метод для получения длины
    public double getLength() {
        return length;
    }

    // Метод для установки ширины
    public void setWidth(double width) {
        this.width = width;
    }

    // Метод для получения ширины
    public double getWidth() {
        return width;
    }

    // Метод для вычисления площади
    public double calculateArea() {
        return length * width;
    }

    // Метод для вычисления периметра
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Создание объекта класса Rectangle с конкретными значениями длины и ширины
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Использование методов для получения и вывода информации о прямоугольнике
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}