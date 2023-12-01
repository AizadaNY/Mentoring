package udemyLearningCode.arrays;

public class IsUnique {

    public static void main(String[] args) {

        /*
        Write a program to check if an array is unique or not.

Example

int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true
         */

        int[] intArray = {1,2,3,4,5,6,5};
        checkArray(intArray);
    }

    public static void checkArray(int[] array){
    boolean isUnique=false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[i]==array[j]){
                    isUnique=false;
                    break;
                }else{
                    isUnique=true;
                }
            }
        }
        System.out.println(isUnique);
    }
}
