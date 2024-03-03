package timus.task_1293;
import java.io.PrintWriter;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = (N * (A*B)) * 2;
        out.println(result);
        out.flush();
    }
}
