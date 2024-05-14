package udemylearningcode.queue;

public class Main {

    public static void main(String[] args) {
//        QueueArray queueArray=new QueueArray(3);
//        queueArray.enQueue(3);
//        queueArray.enQueue(5);
//        queueArray.enQueue(7);
//        queueArray.enQueue(8);
//
        CircularQueue cq=new CircularQueue(4);
        cq.enQueue(56);
        cq.enQueue(76);
        cq.enQueue(100);
        cq.enQueue(123);
        cq.enQueue(123);
    }


}
