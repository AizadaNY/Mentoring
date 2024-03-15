package programTasks.ATM;

import java.util.Scanner;

public class Customer {



    private static final int continueYes = 1;

    public static int getContinueYes() {
        return continueYes;
    }

    public static <T> T input(String message) {
        System.out.println(message);
        T userInput = null;
        try {
            Scanner scanner = new Scanner(System.in);
            userInput = (T) scanner.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInput;
    }

    public Integer choice() {
        Integer choice=Customer.input("Do you want to continue?  \nSelect 1 if 'Yes', 2 if 'No'");
        if (choice.equals(continueYes)) {
        } else {
            System.out.println("Thanks");
        }
        return choice;
    }
}
