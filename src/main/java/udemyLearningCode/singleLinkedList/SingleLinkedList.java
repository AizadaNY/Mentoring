package udemyLearningCode.singleLinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
        head = new Node();   // O(1)
        Node node = new Node();  // O(1)
        node.next = null; // O(1)
        node.value = nodeValue; // O(1)
        head = node; // O(1)
        tail = node; // O(1)
        size = 1; // O(1)
        return head;
    }
    /*
    Time complexity is O(1)
    Space complexity is O(1)
     */




}
