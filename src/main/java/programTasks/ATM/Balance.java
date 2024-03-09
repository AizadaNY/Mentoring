package programTasks.ATM;

public class Balance {

    private double balance=0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double sum){
        balance=balance+sum;
    }

    public void withdraw(double sum){
        if(balance>sum){
            balance=balance-sum;
        }else{
            System.out.println("You dont have enough ");
        }
    }

}
