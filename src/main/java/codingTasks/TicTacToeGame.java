package codingTasks;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
        String[][] arr = {{" "," "," "},{" "," "," "},{" "," "," "}};
        for (int a = 0; a < 3; a++) {
            Scanner input = new Scanner(System.in);

            //User 1
            System.out.println("Insert location of the cell");
            System.out.println("Row number");
            int row = input.nextInt();
            System.out.println("Column number");
            int column = input.nextInt();
            arr[row][column]="X";
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            //User 2
            System.out.println("Insert location of the cell");
            System.out.println("Row number");
            int row2 = input.nextInt();
            System.out.println("Column number");
            int column2 = input.nextInt();
            arr[row2][column2]="O";
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
        }
        }

}
