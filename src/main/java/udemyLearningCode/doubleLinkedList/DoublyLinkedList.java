package udemyLearningCode.doubleLinkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDlL(int nodeValue){
        head=new DoublyNode();
        DoublyNode newNode=new DoublyNode();
        newNode.value=nodeValue;
        newNode.next=null;
        newNode.prev=null;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }

    public void insertDlL(int nodeValue,int location){
        DoublyNode newNode=new DoublyNode();
        newNode.value=nodeValue;
        if(head==null){
            createDlL(nodeValue);
            return;
        }else if(location==0){
            newNode.next=head;
            newNode.prev=null;
            head.prev=newNode;
            head=newNode;
        }else if(location>=size){
            newNode.next=null;
            tail.next=newNode;
            newNode.prev=tail;
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
            newNode.next.prev=newNode;
        }
        size++;
    }

    public void traverseDlL(){
        if(head!=null){
            DoublyNode tempNode=head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i<size-1){
                    System.out.print("-->");
                }
                tempNode=tempNode.next;
            }
        }else{
            System.out.println("Doubly linked list doesn't exist");
        }
        System.out.print("\n");
    }

    public void reverseTraverse(){
        if(head!=null){
            DoublyNode tempNode=tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i<size-1){
                    System.out.print("-->");
                }
                tempNode= tempNode.prev;
            }

        }else{
            System.out.print("DlL doesn't exist!");
        }
        System.out.print("\n");
    }

    public boolean searchNode(int value) {

        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == value) {
                    System.out.print("The node is fount at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.print("Node "+value+ " not found");
        return false;

    }





}
