package programTasks;

import java.util.Scanner;

public class TemperatureConverter {
    /*
    Temperature Converter: Write a program that converts temperature from Fahrenheit to Celsius and vice versa.
     This introduces the concept of user input and basic mathematical formulas in programming.
     */

    public static void main(String[] args) {

        int result = calculate(getUserData(), getTemp());
        System.out.println(result);

    }

    public static String getUserData(){
        String result="";
        try {
            System.out.println("Provide your data. If its  Fahrenheit provide 'F' if its  Celsius 'C' ");
            Scanner scanner=new Scanner(System.in);
             result=scanner.next();
        }catch (Exception e){
            e.printStackTrace();
        }
       return result;
    }

    public static int getTemp(){
        int result=0;
        try {
            System.out.println("Provide temperature  value");
            Scanner scanner=new Scanner(System.in);
            result=scanner.nextInt();
        }catch (Exception e){
          e.printStackTrace();
        }
        return result;

    }

    public static int calculate(String type,int temp){
      int result=0;
        if(type.toLowerCase().contains("f")){
           result=(temp-32)*5/9;
           System.out.println(temp+" "+"F         "+ result+" Celsius" );
        }else{
           result=temp*9/5+32;
            System.out.println(temp+" "+"C          "+ result+" Fahrenheit" );
        }
        return result;
    }
}
