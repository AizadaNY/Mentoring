package codingTasks;

import org.junit.Test;

import java.util.List;

public class FibonacciNumber {

    public static void main(String[] args) {
        int num = Methods.getUserInputNumbers();
        Methods.getFibonacciNumberUsingLoop(num);
        List<Integer> list=Methods.getFibonacciNumberUsingRecursion(num);
        System.out.println("List of Fibonacci numbers recursion method "+list);

    }



}