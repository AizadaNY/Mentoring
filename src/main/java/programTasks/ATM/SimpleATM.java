package programTasks.ATM;

import java.util.Scanner;

public class SimpleATM {

    /*
     *Simple ATM Interface: Simulate an ATM interface where a user can check the balance,
     *deposit, and withdraw money.
     *This task introduces the concept of maintaining state and handling user choices.
     */


    public static void main(String[] args) {
        SimpleATM atm = new SimpleATM();
        atm.operation();
        while (atm.choice() == 1) {
            atm.operation();
        }
    }






}
