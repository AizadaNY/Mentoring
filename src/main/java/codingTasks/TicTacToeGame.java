package codingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
//        Table table=new Table(3,3);
        String[][] table = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
        boolean isFull = false;
        boolean userWon = false;
        isFull=TicTacToeGame.isTableFull(table);
        userWon=TicTacToeGame.gameResult(table);
        while (!isFull||!userWon) {
            Scanner input = new Scanner(System.in);
            TicTacToeGame.getUser1Input(input, table);
            TicTacToeGame.getUser2Input(input, table);
        }
    }

    public static void getUser1Input(Scanner input, String[][] table) {
        System.out.println("User 1:Insert location of the cell");
        System.out.println("Insert row number");
        int row = input.nextInt();
        System.out.println("Column number");
        int column = input.nextInt();
        table[row][column] = "X";
        for (int a = 0; a < table.length; a++) {
            System.out.println(Arrays.toString(table[a]));
        }
    }

    public static void getUser2Input(Scanner input, String[][] table) {
        System.out.println("User 2:Insert location of the cell");
        System.out.println("Insert row number");
        int row2 = input.nextInt();
        System.out.println("Column number");
        int column2 = input.nextInt();
        table[row2][column2] = "O";
        for (int a = 0; a < table.length; a++) {
            System.out.println(Arrays.toString(table[a]));
        }
    }

    public static boolean isTableFull(String[][] array) {
        boolean tableStatus=false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tableStatus=!(array[i][j].isEmpty());
            }
        }
        return tableStatus;
    }

    public static boolean gameResult(String[][] table) {
        boolean gameResult=false;
        List<String> rowValues = new ArrayList<>();
        List<String> columnValues = new ArrayList<>();
        List<String> dioValues1 = new ArrayList<>();
        List<String> dioValues2 = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            rowValues.clear();
            columnValues.clear();
            dioValues1.clear();
            dioValues2.clear();
            for (int j = 0; j < table[i].length; j++) {
                rowValues.add(table[i][j]);
                columnValues.add(table[j][i]);
                dioValues1.add(table[j][j]);
                dioValues2.add(table[j][j--]);
                if ((rowValues.stream().allMatch(n -> n.equals("X"))) || (columnValues.stream().allMatch(n -> n.equals("X")))
                        || (dioValues1.stream().allMatch(n -> n.equals("X"))) || (dioValues2.stream().allMatch(n -> n.equals("X")))) {
                    gameResult = true;
                    System.out.println("User 1 won the game");
                    break;
                } else if ((rowValues.stream().allMatch(n -> n.equals("O"))) || (columnValues.stream().allMatch(n -> n.equals("O")))
                        || (dioValues1.stream().allMatch(n -> n.equals("O"))) || (dioValues2.stream().allMatch(n -> n.equals("O")))) {
                    gameResult = true;
                    System.out.println("User 2 won the game");
                    break;
                }


            }
        }
        return gameResult;
    }


}
