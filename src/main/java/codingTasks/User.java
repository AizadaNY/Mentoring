package codingTasks;


import java.util.Arrays;
import java.util.Scanner;

public class User {
    public String userName;
    public String sign;
    public boolean cellOccupied = false;

    User(String userName, String sign) {
        this.userName = userName;
        this.sign = sign;
    }

    public int getUserRowNumber(Scanner input) {
        System.out.println(this.userName + " Insert location of the cell");
        System.out.println("Insert row number");
        return input.nextInt();
    }

    public int getUserColumnNumber(Scanner input) {
        System.out.println("Column number");
        return input.nextInt();
    }

    public boolean isCellEmpty(String value, String[][] arr, Scanner scanner) {
        int row = getUserRowNumber(scanner);
        int column = getUserColumnNumber(scanner);
        if (arr[row][column].isEmpty()) {
            arr[row][column] = value;
          return arr[row][column].isEmpty();
        } else {
            System.out.println("Cell already occupied.Select different location");
            cellOccupied = true;
        }
       return cellOccupied;
    }
//    public void putValueToTheMultidimensionalArray(String value, String[][] arr, Scanner scanner) {
//        int row=getUserRowNumber(scanner);
//        int column=getUserColumnNumber(scanner);
//        if (arr[row][column].isEmpty()) {
//            arr[row][column] = value;
//        } else {
//            System.out.println("Cell already occupied.Select different location");
//            getUserRowNumber(scanner);
//            getUserColumnNumber(scanner);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//
//    }

//    public void move(String[][] arr, Scanner scanner) {
//        do {
//            int row=getUserRowNumber(scanner);
//            int column=getUserColumnNumber(scanner);
//        }while (isCellEmpty())
//        }
//    }

}


