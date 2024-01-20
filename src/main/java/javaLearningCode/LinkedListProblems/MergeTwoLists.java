package javaLearningCode.LinkedListProblems;

public class MergeTwoLists {

    public LinkedList mergeTwoLists(LinkedList list1,LinkedList list2){

        if(list1!=null&&list2!=null){
            if(list1.value<= list2.value){
                list1.next=mergeTwoLists(list1.next, list2);
                return list1;
            }else{
                list2.next=mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if(list1==null){
            return list2;
        }

            return list1;


    }
}
