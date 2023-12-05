package codingTasks;


import java.util.Arrays;
import java.util.Scanner;

public class User {
    public String userName;
    public String sign;
    boolean userMadeMove=false;

    User(String userName, String sign) {
        this.userName = userName;
        this.sign = sign;
    }

    public int getUserRowNumber(Scanner input) {
        System.out.println(this.userName + " Insert location of the cell");
        System.out.println("Insert row number");
        int row=input.nextInt();
        return row;
    }

    public int getUserColumnNumber(Scanner input) {
        System.out.println("Column number");
        int column=input.nextInt();
        return column;
    }

    public void insertValue(String value, String[][] arr, Scanner scanner) {
        int row = getUserRowNumber(scanner);
        int column = getUserColumnNumber(scanner);

        if ( arr[row][column].isEmpty()){
            arr[row][column] = value;
            userMadeMove=true;
        }else{
            System.out.println("Cell already occupied.Select different location");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }


    public void userMoveOnTable(String value, String[][] arr, Scanner scanner){
        do {
           insertValue(value, arr, scanner);
        }while (!userMadeMove);
    }




}


