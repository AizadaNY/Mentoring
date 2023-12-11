package udemyLearningCode.stack;

public class Stack {

    public class Node {

        int value;
        Node next;

        Node(int nodeValue){
         this.value=nodeValue;
         this.next=null;
        }

        private Node top;
        private int height;
    }


}
