package javaLearningCode.LinkedListProblems;

import java.util.List;

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

        ListNode slow=head;
        ListNode fast=head;

        while (fast.next!=null&&fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        }





    }

    public static void main(String[] args) {





    }
}
