package javalearningcode.LinkedListProblems;

public class LinkedList {

    int value;
    LinkedList next;

    LinkedList(){};

    LinkedList(int value){
        this.value=value;
    }

    LinkedList(int value,LinkedList next){
        this.value=value;
        this.next=next;
    }
}
