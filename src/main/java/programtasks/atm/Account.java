package programtasks.atm;

public class Account {

    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double sum) {
        balance = balance + sum;
    }

    public void withdraw(Double sum) {

        if (balance > sum) {
            balance = balance - sum;
        } else {
            System.out.println("You don't have enough balance on your account");
        }
    }
}
