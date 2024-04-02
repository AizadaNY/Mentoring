package udemylearningcode.queuearray;

public class QueueArray {

    int [] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        arr=new int[size];
        topOfQueue=-1;
        beginningOfQueue=1;
        System.out.println("The Queue successfully created");
    }

    public boolean isFull(){
        if(topOfQueue== arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(beginningOfQueue==-1||beginningOfQueue==arr.length){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int value){

        if(isFull()){
            System.out.println("The Queue is full");
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Value successfully inserted");
        }else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Value successfully inserted");
        }
    }
}
