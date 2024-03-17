package programtasks.countvowels;

import programtasks.CommonMethods;

import java.util.Arrays;
import java.util.List;

public class CountVowels {

    /*
    Count Vowels in a String: Develop a program that counts the number of vowels in a given string.
    This will help in understanding string manipulation and the use of loops and conditionals.

     */


    public static void main(String[] args) {

        String str = CommonMethods.getUserInput("Provide a word");
        LettersView.printResult("Count of vowel in given string is:", countVowel(str));
    }

    public static int countVowel(String word) {

        word.toLowerCase();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Letters.isVowel(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }


}
