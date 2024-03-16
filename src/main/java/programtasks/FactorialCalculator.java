package programtasks;

import java.util.Scanner;

public class FactorialCalculator {


    public static void main(String[] args) {
        int userNumber = getUserInput();
        System.out.println(calculateFactorial(userNumber));
        System.out.println("result using loop: " + calculateFactorialLoop(userNumber));
    }

    public static int calculateFactorial(Integer number) {
        if (number > 1) {
            number = number * calculateFactorial(number - 1);
        }
        return number;
    }

    public static int getUserInput() {
        int result = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Provide a number");
            result = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("You should provide a number");
        }
        return result;
    }

    public static int calculateFactorialLoop(int number) {
        Integer result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }


}
