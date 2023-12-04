package codingTasks;

import java.util.Arrays;

public class Test {


    public static int[] middle(int[] array) {

           if(array.length<=2){
               return new int[0];
           }else{
              int[] middleArray=new int[array.length-2] ;
              int index=1;
              while (index<=middleArray.length){
                  middleArray[index-1]=array[index];
                  index++;
              }
               return middleArray;
           }

            }

    public static void main(String[] args) {
        int[] myArray={1,2,3,4};
        int [] middleArray= Test.middle(myArray);
        System.out.println(Arrays.toString(middleArray));
    }

}
