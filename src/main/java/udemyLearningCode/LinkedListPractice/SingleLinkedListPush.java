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














    public void push(int nodeValue) {
        if(head==null){
            pushSlL(nodeValue);
        }else{
            Node newNode=new Node();
            newNode.value=nodeValue;
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
            size++;
        }
    }


    public Node pop() {
        if(head==null) {
            System.out.println("The Single Linked List does not exist");
            return null;
        }
        Node removeNode;
        Node currentNode;
        if(head==tail){
           removeNode=head;
           head=tail=null;
        }else{
            currentNode=head;
           while (currentNode.next!=tail){
               currentNode=currentNode.next;

           }
           removeNode=currentNode.next;
           currentNode.next=null;
           tail=currentNode;
           size--;
        }
        return removeNode;
    }

}
