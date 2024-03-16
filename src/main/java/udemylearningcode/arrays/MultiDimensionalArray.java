package udemylearningcode.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //Declaration
        int[][] int2DArray=null;

        //Instantiating
        int2DArray=new int[2][2];

        //Initializing
        int2DArray[0][0]=10;
        int2DArray[0][1]=20;
        int2DArray[1][0]=30;
        int2DArray[1][1]=40;

        System.out.println(Arrays.deepToString(int2DArray));

        String [][] string2DArray={{"0","X"},{"X","0"}};
        System.out.println(Arrays.deepToString(string2DArray));


    }
}
