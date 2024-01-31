package programTasks;

import java.util.Scanner;

public class BasicCalculator {

    public String userInput(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }

    public String[]  convertString(String operation){
       String str=userInput();
       String[] arr=str.split(operation);
       return arr;
    }



    public double addition(String input){
        String [] result=convertString(input);
        result[0].
    }

    public double subtraction(double d1,double d2){

        return d1-d2;
    }

    public double multiplication(double d1,double d2){

        return d1*d2;
    }

    public double division(double d1,double d2){

        return d1/d2;
    }

    public String calculator(){
        if(userInput().contains("+")){

        }

    }
}
