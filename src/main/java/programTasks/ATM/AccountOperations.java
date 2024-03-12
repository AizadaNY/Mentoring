package programTasks.ATM;

import java.util.Scanner;

public class AccountOperations {
    private static final int balanceOption = 1;
    private static final int depositOption = 2;
    private static final int withdrawOption = 3;
    Account accountBalance = new Account();

    public void operation() {
        int operation = Customer.input("Please select operation  \n1.Balance \n2.Deposit Money\n3.Withdraw money")

        if (operation == balanceOption) {
            System.out.println("Your balance is " + accountBalance.getBalance());
        } else if (operation == depositOption) {
            System.out.println("Deposit sum");
            accountBalance.deposit(Customer.input("Deposit amount"));
        } else if (operation == withdrawOption) {
            System.out.println("Withdraw sum");
            accountBalance.withdraw(Customer.input("Withdraw amount"));
        } else {

        }


    }

    public int choice() {
        System.out.println("Do you want to continue?");
        System.out.println("Select 1 if 'Yes', 2 if 'No'");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            choice = 1;
        } else {
            System.out.println("Thanks");
        }
        return choice;
    }
}
