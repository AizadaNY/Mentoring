package codingTasks;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
//        Table table=new Table(3,3);
        String [][] table={{"","",""},{"","",""},{"","",""}};
        Scanner input = new Scanner(System.in);
        boolean isFull=false;
        while (!isFull){
            System.out.println("Insert row number");
            int row = input.nextInt();
            System.out.println("Column number");
            int column = input.nextInt();
            table[row][column]="X";
            System.out.println("Insert row number");
            int row2 = input.nextInt();
            System.out.println("Column number");
            int column2 = input.nextInt();
            table[row2][column2]="O";
            for (int a = 0; a < table.length; a++) {
                System.out.println(Arrays.toString(table[a]));
            }

            for (int i = 0; i <table.length ; i++) {
                for (int j = 0; j <table[i].length ; j++) {
                    isFull= !(table[i][j].isEmpty());
                }
            }

        }










//       do {
//
//            //User 1
//            System.out.println("User 1:Insert location of the cell");
//            System.out.println("Row number");
//            row = input.nextInt();
//            System.out.println("Column number");
//             column = input.nextInt();
//
//           for (int i = 0; i < table.arr.length; i++) {
//               isFull=((!table.arr[i][0].isEmpty()&&!table.arr[i][1].isEmpty()&&!table.arr[i][2].isEmpty())&&
//                       (table.arr[i][0]==table.arr[i][1]&&table.arr[i][0]==table.arr[i][2]));
//
//
//           }} while (!isFull);
//
//        table.insertValue(row, column,  "X");
//        for (int a = 0; a < table.arr.length; a++) {
//            System.out.println(Arrays.toString(table.arr[a]).toString());
//        }


//            //User 2
//            System.out.println("User 2:Insert location of the cell");
//            System.out.println("Row number");
//            int row2 = input.nextInt();
//            System.out.println("Column number");
//            int column2 = input.nextInt();
//            Methods.putValueToTheMultidimensionalArray(row2, column2, "O", arr);



    }

}
