package udemyLearningCode.circularSinglyLinkedList;

import udemyLearningCode.singleLinkedList.Node;

public class CircularSinglyLinkedList {

    Node head;
    Node tail;
    int size;


    public void createCSLL(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value=nodeValue;
        node.next=node;
        head=node;
        tail=node;
        size=1;

    }
    public void insertCSll(int nodeValue,int location){
        Node node =new Node();
        node.value=nodeValue;
        if(head==null){
            createCSLL(nodeValue);
            return;
        }else if(location==0){
            node.next=head;
            head=node;
            tail.next=head;

        }else if(location>=size){
            tail.next=node;
            tail=node;
            node.next=head;
        }else{
           Node tempNode=head;
           int index=0;
           while (index<location-1){
               tempNode=tempNode.next;
               index++;
               node.next=tempNode.next;
               tempNode.next=node;
           }
        }
        size++;
    }

    public void traverseSLL(){

        if(head!=null){
            Node tempNode=head;
            System.out.println("Head value "+tempNode.value);
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("-->");
                }
                tempNode=tempNode.next;
            }

        }else{
           System.out.println("CSLL  not exist");

        }
    }


}
