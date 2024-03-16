package udemylearningcode.singleLinkedList;

import java.util.Scanner;

public class FibonacciNumber {

    public void getList(){
        Scanner scanner=new Scanner(System.in);
        SingleLinkedList list=new SingleLinkedList();
        list.createSingleLinkedList(0);
        list.insertLinkedList(1, 1);
        System.out.println("Please provide size of Fibonacci Number list");
        int size=scanner.nextInt();

        try {
            if(size<=0){
                System.out.println("No data to display");
            }else if(size==1){
                System.out.println("List of fibonacci Number: "+list.head.value);
            }else if(size==2) {
                System.out.println("List of fibonacci Number: " + list.head.value + "," + list.head.next.value);
            }else{
                System.out.print("List of fibonacci Number: "+list.head.value+ ","+list.head.next.value);
                int value=1;
                Node tempNode;

                tempNode= list.head;
                for (int i = 2; i < size; i++) {

                    value+=tempNode.value;
                    list.insertLinkedList(value, i);
                    tempNode=tempNode.next;
                    System.out.print(","+value);

                }
            }
        }catch (Exception e){
            System.out.println("Special characters or letters not allowed to enter");
        }

    }

}
