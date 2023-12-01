package udemyLearningCode.arrays;

import java.util.Arrays;

public class StackOverflowQuestion {


    public static void main(String[] args) {
        String [][] arr=new String[17][34];
        //add values
        arr[0][0]="First Cell Value";
        arr[0][5]="Fifth Cell Value first row";
        arr[3][5]="Fifth Cell Value third row";
        /*
        Multidimensional Array-means you have a String array that contains
        17 Rows and 34 Columns
        to get any cell based on your requirements  from this array you will be using nested loop (loop inside the loop)
        */
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                //first row number
                //second column number
                String firstCellValue=arr[i][j]; // arr[0][0]
                /*
                it will go arr[0][1],arr[0][2],arr[0][2] till length of the 1 row (i will be 0, j will be
                from 0 -->length of the 1st row)
                then it will got second round (i will be 1 ,j will be
                from 0 -->length of the 2nd row , and so on
                put if statement to get desired cellValue
                */
            }
        }

        /*
        If you have specific Location you can just

        */
        String value=arr[0][0];
        System.out.println(value);
        System.out.println(Arrays.deepToString(arr));

    }

}
