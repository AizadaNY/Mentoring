package udemylearningcode.stack.LinkedList;

public class LinkedList {

   public Node head;
   public Node tail;
   public int size;

   public Node createLinkedList(int nodeValue){
       head=new Node();
       Node node=new Node();
       node.next=null;
       node.value=nodeValue;
       head=node;
       tail=node;
       size=1;

       return head;
   }

   public void insertLinkedList(int value,int location){
       Node node=new Node();
       node.value=value;
       if(head==null){
           createLinkedList(value);
       }else if(location==0){
           node.next=head;
           head=node;
       }else if(location>=size){
           tail.next=node;
           tail=node;
           node.next=null;
       }else{
           Node tempNode=head;
           int index=0;
           while (index<location-1){
               tempNode=tempNode.next;
               index++;
           }
           Node nextNode=tempNode.next;
           tempNode.next=node;
           node.next=nextNode;
       }
       size++;

   }

   public void deleteNode(int location){
       if(head==null){
           System.out.println("Linked List does not exist");
       }else if(location==0){
           head=head.next;
           size--;
           if(size==0){
               tail=null;
           }
       }else if(location>=size){
           Node tempNode=head;
           for (int i = 0; i <size-1; i++) {
               tempNode=tempNode.next;
           }
           if(tempNode==head){
               head=null;
               tail=null;
               size--;
               return;
           }
           tempNode.next=null;
           tail=tempNode;
           size--;
       }else{
           Node tempNode=head;
           for (int i = 0; i <location-1; i++) {
               tempNode=tempNode.next;
           }
           tempNode.next=tempNode.next.next;
           size--;
       }

   }


}
