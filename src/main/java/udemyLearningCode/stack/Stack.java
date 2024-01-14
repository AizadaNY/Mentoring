package udemyLearningCode.stack;

public class Stack {

  int [] arr;
  int topOfTheStack;

  //TC 01    SC ON
  public Stack(int size){
      this.arr=new int[size];
      this.topOfTheStack=-1;
      System.out.println("Stack is created with size "+size);
  }
 //TC  O1     SC  O1
    public Boolean isEmpty(){
       if(topOfTheStack==-1){
           return true;
       }else{
           return false;
       }
    }


    //TC  O1     SC O1
    public Boolean isFull(){
      if(topOfTheStack==arr.length-1){
          return true;
      }else {
          return false;
      }
    }

    public void push(int value){
      if(isFull()){
          System.out.println("Stack is full");
      }else{
          arr[topOfTheStack+1]=value;
          topOfTheStack++;
          System.out.println(value+" the value is successfully inserted");
      }
    }

    //pop delete the last element

    public int pop(){
      if (isEmpty()){
          System.out.println("The Stack is empty");
          return -1;
      } else {
          int topStack=arr[topOfTheStack];
          topOfTheStack--;
          return topStack;
      }
    }

    public int peek(){
      if(isEmpty()){
          System.out.println("Stack is empty");
          return -1;
      }else{
          return arr[topOfTheStack];
      }
    }

    public void deleteStack(){
      arr=null;
      System.out.println("The Stack is successfully deleted");
    }
}


