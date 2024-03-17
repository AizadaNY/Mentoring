package programtasks;

public class PalindromeChecker {

    public static void main(String[] args) {

        Boolean result = check(CommonMethods.getUserInput("Please provide any word"));
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
