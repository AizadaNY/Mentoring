package programtasks.atm;

import programtasks.CommonMethods;

public class AccountOperations {

    private static final int BALANCE = 1;
    private static final int DEPOSIT_MONEY = 2;
    private static final int WITHDRAW_MONEY = 3;

    Account account = new Account();

    public void updateBalance() {

        int option = CommonMethods.input("Please select operation  \n1.Balance \n2.Deposit Money\n3.Withdraw money");

        if (option == BALANCE) {
            System.out.println("Your balance is " + account.getBalance());
        } else if (option == DEPOSIT_MONEY) {
            account.deposit(CommonMethods.input("Deposit amount: "));
            System.out.println("Deposit sum");
        } else if (option == WITHDRAW_MONEY) {
            account.withdraw(CommonMethods.input("Withdraw amount: "));
            System.out.println("Withdraw sum");
        }

    }


}
