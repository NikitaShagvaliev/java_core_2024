package lr8;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XmlParserNew {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:/java_ex/java core 2024/src/lr8/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());

            Scanner scanner = new Scanner(System.in);

            // Управляющее меню
            while (true) {
                System.out.println("1. Добавить новую книгу");
                System.out.println("2. Искать книги по автору или году издания");
                System.out.println("3. Удалить книгу по названию");
                System.out.println("4. Выход");
                System.out.print("Выберите опцию: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // consume the newline

                switch (choice) {
                    case 1:
                        System.out.print("Введите название книги: ");
                        String title = scanner.nextLine();
                        System.out.print("Введите автора книги: ");
                        String author = scanner.nextLine();
                        System.out.print("Введите год издания книги: ");
                        String year = scanner.nextLine();
                        addBook(doc, title, author, year);
                        saveXML(doc, inputFile);
                        break;
                    case 2:
                        System.out.print("Введите имя автора или год для поиска: ");
                        String query = scanner.nextLine();
                        System.out.print("Поиск по автору (true/false)? ");
                        boolean searchByAuthor = scanner.nextBoolean();
                        searchBooks(doc, query, searchByAuthor);
                        break;

                    case 3:
                        System.out.print("Введите название книги для удаления: ");
                        String bookTitleToDelete = scanner.nextLine();
                        deleteBook(doc, bookTitleToDelete);
                        saveXML(doc, inputFile);
                        break;

                    case 4:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Неверная опция, попробуйте снова.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addBook(Document doc, String title, String author, String year) {
        Element root = doc.getDocumentElement();

        Element newBook = doc.createElement("book");

        Element newTitle = doc.createElement("title");
        newTitle.appendChild(doc.createTextNode(title));
        newBook.appendChild(newTitle);

        Element newAuthor = doc.createElement("author");
        newAuthor.appendChild(doc.createTextNode(author));
        newBook.appendChild(newAuthor);

        Element newYear = doc.createElement("year");
        newYear.appendChild(doc.createTextNode(year));
        newBook.appendChild(newYear);

        root.appendChild(newBook);
    }

    private static void saveXML(Document doc, File file) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
    }

    private static void searchBooks(Document doc, String query, boolean searchByAuthor) {
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String value;
                if (searchByAuthor) {
                    value = element.getElementsByTagName("author").item(0).getTextContent();
                } else {
                    value = element.getElementsByTagName("year").item(0).getTextContent();
                }
                if (value.equalsIgnoreCase(query)) {
                    System.out.println("Название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
                }
            }
        }
    }

    private static void deleteBook(Document doc, String title) {
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String bookTitle = element.getElementsByTagName("title").item(0).getTextContent();
                if (bookTitle.equalsIgnoreCase(title)) {
                    element.getParentNode().removeChild(element);
                    break;
                }
            }
        }
    }
}
