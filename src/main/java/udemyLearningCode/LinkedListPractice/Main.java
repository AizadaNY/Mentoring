package udemyLearningCode.LinkedListPractice;

public class Main {

    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.createLl(3);
        list.insertNode(4);
        list.insertNode(9);
        list.insertNode(5);
        list.insertNode(9);
        list.insertNode(1);
        list.traversal();
        list.removeDuplicates();
        list.traversal();


    }
}
