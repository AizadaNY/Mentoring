package udemyLearningCode.arrays;

import java.util.Arrays;

public class arraysClass {

    public static void main(String[] args) {
        // 1 Dimensional array
        //RAM -Random Access Memory
        // all arrays located in RAM as 1 dimesional Arrayys


        int[] intArray;   //Declaring Array   -------> O(1)
        intArray=new int[3]; // Instantiating -------> O(1)
        intArray[0]=1; //Initializing -------> O(1)
        intArray[1]=2; //-------> O(1)                     --->O(n)
        intArray[2]=3;//-------> O(1)
        System.out.println(Arrays.toString(intArray));


        //Different way to initialize

        String[] strArray={"a","b","c"};//-------> O(1)
        System.out.println(Arrays.toString(strArray));
    }


}
