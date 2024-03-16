package programtasks.atm;

public class SimpleAtm {

    /*
     *Simple ATM Interface: Simulate an ATM interface where a user can check the balance,
     *deposit, and withdraw money.
     *This task introduces the concept of maintaining state and handling user choices.
     */


    public static void main(String[] args) {
        AccountOperations accountOperations=new AccountOperations();
        Customer customer=new Customer();
        accountOperations.updateBalance();
        while (customer.choice()== Customer.CONTINUE) {
            accountOperations.updateBalance();
        }
    }








}
