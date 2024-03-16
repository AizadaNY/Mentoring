package programtasks;

import java.util.Scanner;

public class CommonMethods {

    public static <T> T getUserInput(String message) {
        System.out.println(message);
        T userInput = null;
        try {
            Scanner scanner = new Scanner(System.in);
            userInput = (T) scanner.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInput;
    }
}
