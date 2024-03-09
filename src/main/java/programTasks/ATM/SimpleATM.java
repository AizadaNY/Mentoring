package programTasks.ATM;

import java.util.Scanner;

public class SimpleATM {

    /*
    Simple ATM Interface: Simulate an ATM interface where a user can check the balance,
     deposit, and withdraw money.
     This task introduces the concept of maintaining state and handling user choices.

     */
    Balance balance=new Balance();
    public static void main(String[] args) {

        SimpleATM atm=new SimpleATM();

        atm.operation();
        while (atm.choice()==1){
            atm.operation();
        }
    }


    public Double userInput(){
        Double userInput = null;
        try{
            Scanner scanner=new Scanner(System.in);
             userInput=scanner.nextDouble();
        }catch (Exception e){
            e.printStackTrace();
        }

        return userInput;

    }

    public  void operation(){
        System.out.println("Please select operation");
        System.out.println("1.Balance \n2.Deposit Money\n3.Withdraw money");
        int operation=0;
        try {
            Scanner scanner=new Scanner(System.in);
            operation=scanner.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }


        if(operation==1){

            System.out.println("Your balance is "+balance.getBalance());

        }else if(operation==2){

            System.out.println("Deposit sum");
            balance.deposit(userInput());

        }else if(operation==3){

            System.out.println("Withdraw sum");
            balance.withdraw(userInput());

        }else{

        }


    }

    public int choice(){
        System.out.println("Do you want to continue?");
        System.out.println("Select 1 if 'Yes', 2 if 'No'");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        if(choice==1){
           choice=1;
        }else{
            System.out.println("Thanks");
        }
        return choice;
    }







}
