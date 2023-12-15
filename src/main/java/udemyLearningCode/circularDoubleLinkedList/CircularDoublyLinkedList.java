package udemyLearningCode.circularDoubleLinkedList;

public class CircularDoublyLinkedList {

    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createCdLl(int value){
        DoublyNode newNode=new DoublyNode();
        head=new DoublyNode();
        newNode.value=value;
        head=newNode;
        tail=newNode;
        newNode.next=newNode;
        newNode.prev=newNode;
        size=1;

      return head;
    }

    //O1  O1
    public void insertCdLl(int value,int location){
        DoublyNode newNode=new DoublyNode();
        newNode.value=value;
         if(head==null){
             createCdLl(value);
             return;
         }else if (location==0){
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            head=newNode;

         }else if(location>=size){
             newNode.next=head;
             newNode.prev=tail;
             head.prev=newNode;
             tail.next=newNode;
             tail=newNode;
         }else{
             DoublyNode tempNode=head;
             int index=0;
             while (index<location-1){
                 tempNode=tempNode.next;
                 index++;
             }
             newNode.prev=tempNode;
             newNode.next=tempNode.next;
             tempNode.next=newNode;
             newNode.next.next=newNode;
         }

         size++;

    }


}
