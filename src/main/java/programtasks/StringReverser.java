package programtasks;

import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {

        String reversedString = reverseString(CommonMethods.getUserInput("Please provide any word"));
        System.out.println(reversedString);
    }

    public static String reverseString(String input) {

        StringBuffer reversedString = new StringBuffer();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }
        return reversedString.toString();
    }



}


