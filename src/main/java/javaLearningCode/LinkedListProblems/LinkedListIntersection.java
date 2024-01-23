package javaLearningCode.LinkedListProblems;

public class LinkedListIntersection {

    /*
    Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:
     */


    public ListNode intersectionNode(ListNode headA,ListNode headB){
         ListNode a=headA;
         ListNode b=headB;

         while (a!=b){
             if(a==null){
                 a=headA;
             }else{
                 a=a.next;
             }

             if(b==null){
                 b=headB;
             }else{
                 b=b.next;
             }
         }
         return a;
    }
}
