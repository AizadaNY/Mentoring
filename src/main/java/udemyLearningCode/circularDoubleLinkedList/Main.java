package udemyLearningCode.circularDoubleLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularDoublyLinkedList cDlL=new CircularDoublyLinkedList();
        cDlL.createCdLl(3);
        System.out.println(cDlL.head.value);
        cDlL.insertCdLl(7, 0);
        cDlL.insertCdLl(19, 2);
        cDlL.insertCdLl(14, 3);
        cDlL.insertCdLl(17, 4);
        System.out.println(cDlL.head.value);

        cDlL.traverseCdLl();
        cDlL.reverseTraverse();
        cDlL.deleteCdLl(5);
        cDlL.traverseCdLl();
    }




}
