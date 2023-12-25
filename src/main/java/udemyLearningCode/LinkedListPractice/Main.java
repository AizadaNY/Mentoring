package udemyLearningCode.LinkedListPractice;

public class Main {

    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        RemoveDups removeDups=new RemoveDups();
        list.createLl(3);
        list.insertNode(4);
        list.insertNode(9);
        list.insertNode(5);
        list.insertNode(9);
        list.insertNode(1);
        list.traversal();
      removeDups.removeDuplicate(list);
        list.traversal();


    }
}
