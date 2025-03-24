package DAY3;
class Node {
    int data;
    Node next;
    Node prev;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Method to insert a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    // Method to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to copy the doubly linked list
    public DoublyLinkedList copyList() {
        DoublyLinkedList newList = new DoublyLinkedList();
        Node current = head;
        while (current != null) {
            newList.append(current.data); // Copy the data to the new list
            current = current.next;
        }
        return newList;
    }


    public static void main(String[] args) {
        // Creating the original doubly linked list
        DoublyLinkedList originalList = new DoublyLinkedList();
        originalList.append(10);
        originalList.append(20);
        originalList.append(30);

        System.out.println("Original List:");
        originalList.printList();

        // Copying the doubly linked list
        DoublyLinkedList copiedList = originalList.copyList();

        System.out.println("Copied List:");
        copiedList.printList();
    }
}
