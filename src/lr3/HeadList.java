package lr3;
public class HeadList {
    private ExistingClass.Node head;

    public void addToHead(int value) {
        ExistingClass.Node newNode = new ExistingClass.Node(value, head);
        head = newNode;
    }

    public void removeFromHead() {
        if (head != null) {
            head = head.next;
        }
    }

    public void printList() {
        ExistingClass.Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

// Пример использования
class Main {
    public static void main(String[] args) {
        HeadList myList = new HeadList();
        myList.addToHead(1);
        myList.addToHead(2);
        myList.addToHead(3);
        myList.printList(); // Выведет: 3 2 1
        myList.removeFromHead();
        myList.printList(); // Выведет: 2 1
    }
}