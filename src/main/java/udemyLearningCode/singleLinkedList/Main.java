package udemyLearningCode.singleLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sLl=new SingleLinkedList();
        sLl.createSingleLinkedList(0);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Fibonacci number size");
        int fibbonaciListSize=scanner.nextInt();

        sLl.fibonacciNumber(fibbonaciListSize);



    }




}
