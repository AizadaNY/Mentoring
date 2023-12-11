package udemyLearningCode.doubleLinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList dLl=new DoublyLinkedList();
        dLl.createDlL(7);
        System.out.println(dLl.head.value);
        dLl.insertDlL(5, 0);
        dLl.insertDlL(8, 1);
        dLl.insertDlL(2, 6);

    }
}
