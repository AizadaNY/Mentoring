package udemylearningcode.queue;

import udemylearningcode.singleLinkedList.SingleLinkedList;

public class QueueLinkedList {

    SingleLinkedList list;
    public void createQueueLinkedList(){
        list=new SingleLinkedList();
        System.out.println("The Queue Linked List successfully created");
    }

    public Boolean isEmpty(){
        if(list.head==null){
            return true;
        }else{
            return false;
        }
    }

    //enque
    public void enQueue(int value){
        list.insertLinkedList(value, list.size);
        System.out.println("Successfully inserted");
    }

    //deQueue
    public int deQueue(){
        int value=-1;
        if(isEmpty()){
            System.out.println("DeQueue is empty");
        }else{
            value=list.head.value;
            list.deleteSingleLinkedList(0);
        }
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("DeQueue is empty");
            return -1;
        }else{
            return list.head.value;
        }
    }

    public void deleteQueue(){
        list.head=null;
        list.tail=null;
        System.out.println("DeQueue is Successfully deleted");
    }


}
