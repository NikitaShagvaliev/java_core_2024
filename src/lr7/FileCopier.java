package lr7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:/java_ex/java core 2024/src/lr7/input.txt");
        FileWriter writer = new FileWriter("C:/java_ex/java core 2024/src/lr7/output.txt");

        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }

        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}

