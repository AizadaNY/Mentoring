package udemyLearningCode.circularSinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularSinglyLinkedList cSlL=new CircularSinglyLinkedList();
        cSlL.createCSLL(10);
        cSlL.insertCSll(12, 0);
        cSlL.insertCSll(11, 3);
        cSlL.insertCSll(15, 4);
        System.out.println(cSlL.head.value);
        cSlL.traverseSLL();

    }
}
