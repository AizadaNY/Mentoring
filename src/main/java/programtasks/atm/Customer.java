package programtasks.atm;

import programtasks.CommonMethods;

import java.util.Scanner;

public class Customer {

    public static final int CONTINUE = 1;

    public Integer choice() {

        Integer choice= CommonMethods.getUserInput("Do you want to continue?  \nSelect 1 if 'Yes', 2 if 'No'");

        if (choice.equals(CONTINUE)) {
        } else {
            System.out.println("Thanks");
        }
        return choice;
    }
}
