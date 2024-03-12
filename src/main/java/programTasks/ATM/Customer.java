package programTasks.ATM;

import java.util.Scanner;

public class Customer {

    public static Double input(String message) {
        System.out.println(message);
        Double userInput = null;
        try {
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInput;
    }
}
