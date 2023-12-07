package udemyLearningCode.circularSinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularSinglyLinkedList cSlL=new CircularSinglyLinkedList();
        cSlL.createCSLL(10);

        cSlL.insertCSll(12, 2);
        System.out.println(cSlL.head.next.value);
    }
}
