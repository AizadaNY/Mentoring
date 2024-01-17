package javaLearningCode.LinkedListProblems;

public class LinkedList {

    Node head;

    public void insert(int value){

        Node node=new Node();
        node.value=value;

        if(head==null){
            head=node;
        }else{
            Node tempNode=head;
            while (tempNode.next!=null){
                tempNode=tempNode.next;
            }
            tempNode.next=node;
        }

    }
    public void insert(int value,int location){

        Node node=new Node();
        node.value=value;
        if(location==0){

        }
    }

    public void print(){

     Node tempNode=head;
     while (tempNode.next!=null){
         System.out.println(tempNode.value);
         tempNode=tempNode.next;
     }
        System.out.println(tempNode.value);
    }


    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(4);
        list.insert(7);
        list.insert(10);
        list.print();

    }
}
