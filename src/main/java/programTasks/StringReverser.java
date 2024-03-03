package programTasks;

import java.util.Scanner;

public class StringReverser {

//word
    public static void main(String[] args) {
        String input=getUserInput();
        String reversedString=reverseString(input);
        System.out.println(reversedString);

    }

    public static String reverseString(String input){
        String reversedString="";
        for (int i = input.length()-1; i>=0 ; i--) {
            reversedString+=input.charAt(i);
        }

        return reversedString;

    }

    public static String getUserInput(){
        String input="";
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please provide any word");
            input=scanner.next();
        }catch (Exception e){
            System.out.println("You should provide a word");
        }

        return  input;
    }
}


