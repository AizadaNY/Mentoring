package programtasks.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class Game {




    public static void main(String[] args) {
          int randomNumber=getRandomNumber();
          int userNumber=getUserGuess();

          if(randomNumber!=userNumber){
              checkUserGuess(userNumber, randomNumber);
          }else{
              System.out.println("You are right the number is: "+userNumber);
          }


    }
    public static int getRandomNumber(){
        Random random=new Random();
        return random.nextInt(1000);
    }

    public static int getUserGuess(){
        int result=0;
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Guess the number from 1 to 1000");
           result=scanner.nextInt();
        }catch (Exception e){
            System.out.println("You should provide a number");
        }
        return  result;
    }

    public static void checkUserGuess(int userNumber,int randomNumber){

        if(userNumber<1&&userNumber>1000){
            System.out.println("Number is out of bound");
        }else if(randomNumber>userNumber) {
            if(randomNumber-userNumber>200){
                System.out.println("Too low");
            }else if(randomNumber-userNumber<20){
                System.out.println("Almost there");
            }else{
                System.out.println("low");
            }
        }else if(randomNumber<userNumber){
            if(userNumber-randomNumber>200){
                System.out.println("Too high");
            }else if(userNumber-randomNumber<20){
                System.out.println("Almost there");
            }else{
                System.out.println("high");
            }
        }
    }
}
