package programTasks.ATM;

public class Balance {

    double balance=0;

    public void deposit(int sum){
        balance=balance+sum;
    }

    public void withdraw(int sum){
        if(balance>sum){
            balance=balance=sum;
        }else{
            System.out.println("You dont have enough ");
        }
    }

}
