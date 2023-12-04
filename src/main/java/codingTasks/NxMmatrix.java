package codingTasks;

import javax.swing.text.TabableView;
import java.util.*;

public class NxMmatrix {


    public static void main(String[] args) {
        int rowNumber = 0;
        int columnNumber = 0;
        Scanner scanner = new Scanner(System.in);
        String input1 = "";
        String input2 = "";
        System.out.println("Provide any 2 numbers to get NxM Random Matrix");
        do {
            System.out.println("Please provide row number");
            input1 = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (input1.contains("quit")) {
                System.out.println("Exit");
               break;
            }

            System.out.println("Please provide column number");
            input2 = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (input2.contains("quit")) {
                System.out.println("Exit");
                break;
            }
            try {
                rowNumber = Integer.parseInt(input1);
                columnNumber = Integer.parseInt(input2);
                Methods.getNxM_matrix(rowNumber, columnNumber);
            } catch (NumberFormatException exception) {
                System.out.println("Special characters or letters not allowed to enter");
            }
        } while (!(input2.contains("quit")));






    }
}
