package udemylearningcode.linkedListPractice;

public class SlLPush {

    Node head;
    Node tail;
    int size;

    public Node pushSlL(int nodeValue){
        head=new Node();
        Node newNode=new Node();
        newNode.next=null;
        newNode.value=nodeValue;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }

    public void insertSlL(int nodeValue){
        if(head==null){
            pushSlL(nodeValue);
            return;
        }else{
            Node newNode=new Node();
            newNode.value=nodeValue;
            newNode.next=null;
            tail.next=newNode;
            tail=newNode;
            size++;

        }
    }

}
