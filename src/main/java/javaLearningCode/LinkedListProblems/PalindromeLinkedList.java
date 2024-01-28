package javaLearningCode.LinkedListProblems;

public class PalindromeLinkedList {

/*
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.
 */
    //1 2 2 1  true
    //1 2 3 3 2 1 true
    //1 2 2 3 1  false
    //1 2      false
    public boolean isPalindrome(ListNode head) {
        int count=0;
        ListNode node=head;
        ListNode secondNode=null;
        while (node.next!=null){
            if(node.val==node.next.val){
                secondNode=node.next;
                node.next=null;
                while (secondNode.next!=null){

                    secondNode.next;
                }
            }else{
                node=node.next;
                count++;
            }
        }





    }

    public static void main(String[] args) {





    }
}
