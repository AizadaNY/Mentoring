package programTasks;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = StringReverser.getUserInput();
        Boolean result = check(input);
        System.out.println(result);
    }

    public static boolean check(String input) {
        String reversedString = StringReverser.reverseString(input);
        Boolean isPalindrome = false;
        if (input.equalsIgnoreCase(reversedString)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }


}
