package lr3;

public class TailList {
    private ExistingClass.Node head;
    private ExistingClass.Node tail;

    public void addToTail(int value) {
        ExistingClass.Node newNode = new ExistingClass.Node(value, null);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void removeFromTail() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                tail = head;
                head = head.next;
            }
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
class Start {
    public static void main(String[] args) {
        TailList myList = new TailList();
        myList.addToTail(1);
        myList.addToTail(2);
        myList.addToTail(3);
        myList.printList(); // Выведет: 1 2 3
        myList.removeFromTail();
        myList.printList(); // Выведет: 2 3
    }
}
