package codingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {

        String[][] table = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
        User user1 = new User("User1", "X");
        User user2 = new User("User2", "O");
        boolean isFull = false;
        boolean isUserWon = false;

        Scanner scanner = new Scanner(System.in);
        while (!isFull) {
            user1.userMoveOnTable(user1.sign, table, scanner);
           isUserWon = TicTacToeGame.gameResult(table);
            isFull = TicTacToeGame.isTableFull(table);
            user2.userMoveOnTable(user2.sign, table, scanner);
           isUserWon = TicTacToeGame.gameResult(table);
            isFull = TicTacToeGame.isTableFull(table);
        }
    }


    public static boolean isTableFull(String[][] array) {
        List<Boolean> tableStatusList = null;
        boolean tableStatus = false;
        for (int i = 0; i < array.length; i++) {
            boolean cellStatus = false;
            for (int j = 0; j < array[i].length; j++) {
                if(!array[i][j].isEmpty()){
                    cellStatus=true;
                    tableStatusList.add(cellStatus);
                }else
                    return false;
            }
        }

        if(tableStatusList.size()==9){
            tableStatus=true;
        }
        return tableStatus;
    }

    public static boolean gameResult(String[][] table) {
        boolean gameResult = false;
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




