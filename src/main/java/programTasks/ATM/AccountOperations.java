package programTasks.ATM;

import java.util.Scanner;

public class AccountOperations {

    private static final int balance = 1;
    private static final int depositMoney = 2;
    private static final int withdrawMoney = 3;
    Account accountBalance = new Account();
    public void updateBalance() {
        int option = Customer.input("Please select operation  \n1.Balance \n2.Deposit Money\n3.Withdraw money");

        if (option == balance) {
            System.out.println("Your balance is " + accountBalance.getBalance());
        } else if (option == depositMoney) {
            accountBalance.deposit(Customer.input("Deposit amount: "));
            System.out.println("Deposit sum");
        } else if (option == withdrawMoney) {
            accountBalance.withdraw(Customer.input("Withdraw amount: "));
            System.out.println("Withdraw sum");
        } else {

        }


    }


}
