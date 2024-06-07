package lr8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewsParserNew {
    private static final String URL = "http://fat.urfu.ru/index.html";
    private static final String OUTPUT_FILE = "C:/java_ex/java core 2024/src/lr8/news.txt";
    private static final int MAX_RETRY_ATTEMPTS = 5;
    private static final int RETRY_DELAY_MS = 3000; // 3 секунды

    public static void main(String[] args) {
        Document doc = null;
        int attempt = 0;

        while (attempt < MAX_RETRY_ATTEMPTS) {
            try {
                // Получение HTML-кода страницы
                doc = Jsoup.connect(URL).get();
                break;
            } catch (IOException e) {
                attempt++;
                System.err.println("Ошибка подключения: " + e.getMessage());
                if (attempt < MAX_RETRY_ATTEMPTS) {
                    System.out.println("Попытка переподключения (" + attempt + ")");
                    try {
                        Thread.sleep(RETRY_DELAY_MS);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } else {
                    System.err.println("Не удается подключиться после " + MAX_RETRY_ATTEMPTS + " попыток.");
                    return;
                }
            }
        }

        if (doc == null) {
            System.err.println("Не удалось получить документ.");
            return;
        }

        // Извлечение списка новостей
        Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                "tr > td:nth-child(1)");

        // Запись новостей в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();

                    String tema = ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0).toString();
                    String data = ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0).toString();

                    System.out.println("Тема = " + tema);
                    System.out.println("Дата = " + data + "n");

                    writer.write("Тема = " + tema + "n");
                    writer.write("Дата = " + data + "nn");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
