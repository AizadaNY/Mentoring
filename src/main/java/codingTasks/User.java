package codingTasks;


import java.util.Arrays;
import java.util.Scanner;

public class User {
    public String userName;
    public String sign;

    User(String userName, String sign) {
        this.userName = userName;
        this.sign = sign;
    }

    int row;
    int column;

    public void getUserInput(Scanner input) {
        System.out.println(this.userName + " Insert location of the cell");
        System.out.println("Insert row number");
        row = input.nextInt();
        System.out.println("Column number");
        column = input.nextInt();
    }

    public void putValueToTheMultidimensionalArray(int row, int column, String value, String[][] arr, Scanner scanner) {
        String opponentSign = "";
        if (this.sign.equals("X")) {
            opponentSign = "O";
        } else if (this.sign.equals("O")) {
            opponentSign = "X";
        }

        if (arr[row][column].trim().toUpperCase() != this.sign || arr[row][column].trim().toUpperCase() != opponentSign) {
            arr[row][column] = value;
        } else {
            System.out.println("Cell already occupied.Select different location");
            getUserInput(scanner);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public void userMove(String[][] arr, Scanner scanner) {
        getUserInput(scanner);
        putValueToTheMultidimensionalArray(row, column, this.sign, arr, scanner);
    }


}

