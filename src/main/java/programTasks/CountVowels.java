package programTasks;

import java.util.Arrays;
import java.util.List;

public class CountVowels {

    /*
    Count Vowels in a String: Develop a program that counts the number of vowels in a given string.
    This will help in understanding string manipulation and the use of loops and conditionals.

     */
    private static final List<Character> charList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');

    public static void main(String[] args) {
        String str = StringReverser.getUserInput();
        int count = countVowel(str);
        printResult("Count of vowel in given string is:", count);

    }

    public static int countVowel(String word) {
        word.toLowerCase();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static Boolean isVowel(char ch) {
        Boolean isVowel = false;
        if (charList.contains(ch)) {
            isVowel = true;
        }
        return isVowel;
    }

    public static void printResult(String message, int data) {
        System.out.println(message + " " + data);
    }
}
