package lr8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonNew {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:/java_ex/java core 2024/src/lr8/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;

            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            // Поиск книг по автору
            String authorToFind = "Иванов";
            searchBooksByAuthor(jsonArray, authorToFind);

            // Добавление новой книги
            String newBookTitle = "Новая книга";
            String newBookAuthor = "Новый автор";
            int newBookYear = 2023;
            addNewBook(jsonArray, newBookTitle, newBookAuthor, newBookYear);

            // Удаление книги по названию
            String titleToRemove = "Название книги";
            removeBookByTitle(jsonArray, titleToRemove);

            // Сохранение изменений в JSON файл
            saveChangesToFile(jsonObject, "C:/java_ex/java core 2024/src/lr8/example-json-updated.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchBooksByAuthor(JSONArray jsonArray, String author) {
        for (Object obj : jsonArray) {
            if (obj instanceof JSONObject) {
                JSONObject book = (JSONObject) obj;
                if (author.equals(book.get("author"))) {
                    System.out.println("\nТекущий элемент: book");
                    System.out.println("Название книги: " + book.get("title"));
                    System.out.println("Автор: " + book.get("author"));
                    System.out.println("Год издания: " + book.get("year"));
                }
            }
        }
    }

    private static void addNewBook(JSONArray jsonArray, String title, String author, int year) {
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);
        jsonArray.add(newBook);
        System.out.println("Добавлена новая книга: " + newBook);
    }

    private static void removeBookByTitle(JSONArray jsonArray, String title) {
        Iterator<Object> iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
                System.out.println("Удалена книга: " + book);
            }
        }
    }

    private static void saveChangesToFile(JSONObject jsonObject, String filePath) {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonObject.toJSONString());
            file.flush();
            System.out.println("Изменения сохранены в файл: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
