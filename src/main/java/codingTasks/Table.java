package codingTasks;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Table {
    static String[][] arr;

    public Table(int rowCount, int columnCount) {
       this.arr=new String[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]="";
            }
        }


    }

    public void insertValue(int row, int column, String value) {
        try {
            if (arr[row][column].equals("")) {
                arr[row][column]=value;
                System.out.println("Value successfully inserted");
            } else {
                System.out.println("Cell already occupied.Select different location");
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid index of array");
        }


    }

}