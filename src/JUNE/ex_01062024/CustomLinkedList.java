package JUNE.ex_01062024;

public class CustomLinkedList {

//    1) Need to implement custom link list in Java
//    In this customer link list, need to implement add method and size method,
//    withim capacity of 5 and if it is more than 5 it will not allow 6th element

    private Node head;
    private int size;
    private static final int CAPACITY = 5;

    // Node class representing each element in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Method to add an element to the linked list
    public boolean add(int data) {
        if (size >= CAPACITY) {
            System.out.println("Cannot add element. List is at full capacity.");
            return false;
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    // Method to get the size of the linked list
    public int size() {
        return size;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); // This should not be added

        list.printList(); // Output should be 1 2 3 4 5
        System.out.println("Size of the list: " + list.size()); // Output should be 5
    }
}
