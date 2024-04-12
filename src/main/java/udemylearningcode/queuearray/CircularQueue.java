package udemylearningcode.queuearray;

import java.lang.reflect.Array;

public class CircularQueue {

    int arr[];
    int size;
    int beginningOfQueue;
    int topOfTheQueue;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.beginningOfQueue = -1;
        this.topOfTheQueue = -1;
        System.out.println("Circular queue successfully created with size " + size);
    }

    public boolean isEmpty(int value) {
        if (topOfTheQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(int value) {
        if (topOfTheQueue + 1 == beginningOfQueue) {
            return true;
        } else if (beginningOfQueue == 0 & topOfTheQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if(isFull(value)){
            System.out.println("Circular Queue is full");
        }else if(isEmpty(value)){
            beginningOfQueue=0;
            topOfTheQueue++;
            arr[topOfTheQueue]=value;
            System.out.println("Value successfully inserted");
        }else{
            if(topOfTheQueue+1==size){
                topOfTheQueue=0;
            }else{
                topOfTheQueue++;
            }
            arr[topOfTheQueue]=value;
            System.out.println("Value successfully inserted");
        }
    }
}
