package udemylearningcode.stack.LinkedList;

public class Stack {

    //create  push isEmpty  pop  peek  delete

    LinkedList list;

    public Stack(){
        list=new LinkedList();
    }

    public void push(int value){
        list.insertLinkedList(value, 0);

    }

    public Boolean isEmpty(){
        if(list.head==null){
            return true;
        }else{
            return false;
        }
    }

    public int pop(){
        int result=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            result=list.head.value;
            list.deleteNode(0);
            System.out.println("Successfully deleted "+ list.head.value);

        }
        return result;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            System.out.println("The value is "+ list.head.value);
            return list.head.value;
        }
    }

    public void deleteStack(){
        list.head=null;
        System.out.println("Stack successfully deleted");
    }


}
