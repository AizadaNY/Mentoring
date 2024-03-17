package programtasks;

import java.util.Scanner;

public class FactorialCalculator {


    public static void main(String[] args) {
        int userNumber = CommonMethods.getUserInput("Provide a number");
        System.out.println("result using recursion: " + calculateFactorial(userNumber));
        System.out.println("result using loop: " + calculateFactorialUsingLoop(userNumber));
    }

    public static int calculateFactorial(Integer number) {
        if (number > 1) {
            number = number * calculateFactorial(number - 1);
        }
        return number;
    }

    public static int calculateFactorialUsingLoop(int number) {
        Integer result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }


}
