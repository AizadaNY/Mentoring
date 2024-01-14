package udemyLearningCode.linkedListPractice;

import java.util.HashSet;

public class RemoveDups {

    /*
    Write a method to remove duplicates from an unsorted linked list.

Example

linkedList = 1->2->1->3
deleteDups(linkedList)
//Output
1->2->3
     */

    public void removeDuplicate(LinkedList list){
        HashSet<Integer> set=new HashSet<>();
        Node current= list.head;
        Node prev=null;

        while (current!=null){
            int currentValue=current.value;
            if(set.contains(currentValue)){
                prev.next=current.next;
                list.size--;
            }else {
                set.add(currentValue);
                prev=current;
            }
            current=current.next;
        }

    }

}
