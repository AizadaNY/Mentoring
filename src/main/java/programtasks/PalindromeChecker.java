package programtasks;

public class PalindromeChecker {


    public static void main(String[] args) {

//        boolean result = checkWithStringReverse(CommonMethods.getUserInput("Please provide any word"));
        boolean result = check(CommonMethods.getUserInput("Please provide any word"));
        System.out.println(result);
    }

    public static boolean checkWithStringReverse(String input) {

        String reversedString = StringReverser.reverseString(input);

        boolean isPalindrome = false;
        if (input.equalsIgnoreCase(reversedString)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static boolean check(String input) {

        boolean isPalindrome = false;
        int k = 0;

        for (int i = input.length() - 1; i >= input.length() / 2; i--) {

            if (input.charAt(i) == input.charAt(k)) {
                isPalindrome = true;
            }else{
                isPalindrome=false;
                break;
            }
            k++;
        }
        return isPalindrome;
    }


}
