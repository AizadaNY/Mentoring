package udemylearningcode.queue;

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

    public boolean isEmpty() {
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
        if (isFull(value)) {
            System.out.println("Circular Queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfTheQueue++;
            arr[topOfTheQueue] = value;
            System.out.println("Value successfully inserted");
        } else {
            if (topOfTheQueue + 1 == size) {
                topOfTheQueue = 0;
            } else {
                topOfTheQueue++;
            }
            arr[topOfTheQueue] = value;
            System.out.println("Value successfully inserted");
        }
    }

    //deque   delete first element
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfTheQueue) {
                beginningOfQueue = topOfTheQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    //get first element
    public int peek() {
        if (isEmpty()) {
            System.out.println("The circular queue is empty");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

//delete dequeue
    public void deleteQueue(){
        arr=null;
        System.out.println("The dequeue successfully deleted");
    }


}
