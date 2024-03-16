package javalearningcode.LinkedListProblems;

public class ReverseListDup {


    public ListNode reverseLinkedList(ListNode head){

        ListNode prev=null;
        ListNode current=head;

        while (current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

}
