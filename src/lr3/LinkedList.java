package lr3;

public class LinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void createHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }

    public void addFirst(int data) {
        createHead(data);
    }

    public void addLast(int data) {
        createTail(data);
    }

    public boolean insert(int pos, int data) {
        if (pos < 0) {
            return false;
        }
        if (pos == 0) {
            createHead(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                return false;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return false;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return true;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public boolean remove(int pos) {
        if (pos < 0 || head == null) {
            return false;
        }
        if (pos == 0) {
            head = head.next;
            return true;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                return false;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            return false;
        }

        temp.next = temp.next.next;
        return true;
    }
}
