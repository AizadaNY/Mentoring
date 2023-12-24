package udemyLearningCode.LinkedListPractice;

public class LinkedList {

  public Node head;
  public Node tail;
  public int size;


  public void createLl(int value){

      Node newNode=new Node();
      newNode.value=value;
      newNode.next=null;
      head=newNode;
      tail=newNode;
      size=1;

  }

  public void insertNode(int value){
      Node newNode=new Node();
      newNode.value=value;
      newNode.next=null;
      tail.next=newNode;
      tail=newNode;
      size++;
  }

  public void traversal(){

      Node tempNode=head;
      for (int i = 0; i <size; i++) {
        System.out.print(tempNode.value);
          if(i!=size){
          System.out.print("-->");
          }
          tempNode=tempNode.next;

      }
      System.out.println("\n");

      }

       /*
    Write a method to remove duplicates from an unsorted linked list.
    Example
    linkedList = 1->2->1->3
    deleteDups(linkedList)
    //Output
    1->2->3
     */

    public void removeDuplicates() {
        if (size > 2) {
            Node tempNode = head;
//            Node tempNodeNext = head.next;
            for (int i = 0; i < size; i++) {
                Node tempNodeNext=tempNode.next;
                for (int j = 1; j < size; j++) {
                    if(tempNode==tempNodeNext){
                        tempNode.next=tempNode.next.next;
                        size--;
//                        tempNodeNext=null;
                    }
//                    tempNodeNext=tempNode.next.next;
                }
                tempNode=tempNode.next;
            }

        }

    }

}
