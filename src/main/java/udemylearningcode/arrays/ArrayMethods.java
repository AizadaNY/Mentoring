package udemylearningcode.arrays;

public class ArrayMethods {

    /*
    Given an array, write a function to get first, second best scores from the array and return it in new array.
    Array may contain duplicates.
    Example

    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
    firstSecond(myArray) // {90, 87}
    * */

    public static void main(String[] args) {
       int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        getBestScore(myArray);
    }
    public static void getBestScore(int[] arr){
        int bestScore=0;
        int secondBestScore=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > bestScore) {
                bestScore = arr[i];
            }
        }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>secondBestScore&&arr[i]<bestScore){
                    secondBestScore=arr[i];
                }
        }
        System.out.println("Best score is "+bestScore);
        System.out.println("Second best score is "+secondBestScore);
    }
}
