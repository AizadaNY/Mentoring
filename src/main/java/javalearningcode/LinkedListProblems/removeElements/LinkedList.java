package javalearningcode.LinkedListProblems.removeElements;

public class LinkedList {

    Node head;
    int size;

    //insert value at the end of the list
    public void insert(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) {
            head = new Node();
            head = newNode;
            size = 1;
            System.out.println("Successfully inserted first node");
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }

            tempNode.next = newNode;
            size++;

            System.out.println("Successfully inserted node");
        }
    }

    public void insert(int value, int location) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            insert(value);
        } else {
            if (location == 0) {
                node.next = head;
                head = node;
                size++;
            } else if (location >= size) {
                insert(value);
            } else {
                Node tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                node.next = tempNode.next;
                tempNode.next = node;
                size++;
            }
        }
    }


    public void print() {
        if (head != null) {
            Node tempNode = head;
            while (tempNode.next != null) {
                System.out.println(tempNode.value);
                tempNode = tempNode.next;
            }
            System.out.println(tempNode.value);
        } else {
            System.out.println("No list to print");
        }

    }
}
