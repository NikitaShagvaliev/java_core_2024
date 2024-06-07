package lr4;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            // Убрал лишнюю строку System.out.println("1");
        } catch (Exception e) {
            System.out.println("2 " + e);
        } finally {
            // Добавил блок finally, чтобы закрыть ресурсы или выполнить другие операции
            System.out.println("3");
        }
    }
}
