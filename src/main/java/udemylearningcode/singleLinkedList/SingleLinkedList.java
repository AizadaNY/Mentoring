package udemylearningcode.singleLinkedList;

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


    public void insertLinkedList(int nodeValue, int location){

        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createSingleLinkedList(nodeValue);
        }else if(location==0){
            node.next=head;
            head=node;

        }else if(location>=size){
            node.next=null;
            tail.next= node;
            tail=node;
        }else {
            Node tempNode=head;
            int index=0;
            while (index<location-1){
                tempNode=tempNode.next;
                index++;
            }
        }
        }















    }





