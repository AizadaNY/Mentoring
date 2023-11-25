package codingTasks;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
        boolean isFull=false;
       do {


            Scanner input = new Scanner(System.in);
            String[][] arr = {{"","",""},{"","",""},{"","",""}};

            //User 1
            System.out.println("User 1:Insert location of the cell");
            System.out.println("Row number");
            int row = input.nextInt();
            System.out.println("Column number");
            int column = input.nextInt();

            if((arr[row][column].trim().toUpperCase()!="O")||(arr[row][column].trim().toUpperCase()!="X")){
                arr[row][column]="X";
            }else{
                System.out.println("Cell already occupied.Select different location");
            }
            for (int a = 0; a < arr.length; a++) {
                System.out.println(Arrays.toString(arr[a]).toString());
           }
           for (int i = 0; i < arr.length; i++) {
               isFull=((!arr[i][0].isEmpty()&&!arr[i][1].isEmpty()&&!arr[i][2].isEmpty())&&
                       (arr[i][0]==arr[i][1]&&arr[i][0]==arr[i][2]));
           }} while (!isFull);




//            //User 2
//            System.out.println("User 2:Insert location of the cell");
//            System.out.println("Row number");
//            int row2 = input.nextInt();
//            System.out.println("Column number");
//            int column2 = input.nextInt();
//            Methods.putValueToTheMultidimensionalArray(row2, column2, "O", arr);

        }

}
