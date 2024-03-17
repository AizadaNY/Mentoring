package programtasks.countvowels;

import java.util.Arrays;
import java.util.List;

public class Letters {

    private static final List<Character> vowelsList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');

    public static Boolean isVowel(char ch) {
        Boolean isVowel = false;
        if (vowelsList.contains(ch)) {
            isVowel = true;
        }
        return isVowel;
    }
}
