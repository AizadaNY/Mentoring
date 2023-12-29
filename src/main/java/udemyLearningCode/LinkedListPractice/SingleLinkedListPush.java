package udemyLearningCode.LinkedListPractice;

public class SingleLinkedListPush {


    Node head;
    Node tail;
    int size;


    public Node pushSlL(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public void insertSlL(int value){
        if(head==null){
            pushSlL(value);
        }else {
            Node newNode=new Node();
            newNode.value=value;
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
            size++;
        }
    }

    // Insert Method SinglyLinkedList
    public void push(int nodeValue) {
        if (head == null) {
            insertSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }

}
