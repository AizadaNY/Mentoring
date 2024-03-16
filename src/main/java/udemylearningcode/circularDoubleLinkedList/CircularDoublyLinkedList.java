package udemylearningcode.circularDoubleLinkedList;

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

    public void traverseCdLl(){

        if(head!=null){
            DoublyNode tempNode=head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("-->");
                }
                tempNode=tempNode.next;
            }
        }else {
            System.out.println("Circular Double Linked List does not exist");
        }
        System.out.println("\n");
    }


    public void reverseTraverse(){

     if(head!=null){
         DoublyNode tempNode=tail;

         for (int i = 0; i < size; i++) {
             System.out.print(tempNode.value);
             if(i!=size-1){
                 System.out.print("-->");
             }
             tempNode=tempNode.prev;
         }
     }else{
         System.out.println("Circular Double Linked List does not exist");
     }
        System.out.println("\n");

    }

    public void deleteCdLl(int location){

        if (head == null) {
            System.out.println("Double linked list doesn't exist");
            return;
        }else if(location == 0){
            if (size==1) {
                head.prev = null;
                head.next = null;
                head =tail= null;
                size--;
                return;
            } else {
              head=head.next;
              head.prev=tail;
              tail.next=head;
              size--;
            }
        }else if(location>=size){
            if(size==1){
                head.prev = null;
                head.next = null;
                head =tail= null;
                size--;
                return;
            }else {
                tail=tail.prev;
                tail.next=head;
                head.prev=tail;
                size--;
            }

        }else {
            DoublyNode tempNode=head;
            for (int i = 0; i < location-1; i++) {
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev=tempNode;
            size--;
        }


    }

    public void deleteAllCdLl(){
        DoublyNode tempNode=head;

        for (int i = 0; i <size; i++) {
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        head=null;
        tail=null;

        System.out.println("Circular Doubly Linked List deleted");
    }


}
