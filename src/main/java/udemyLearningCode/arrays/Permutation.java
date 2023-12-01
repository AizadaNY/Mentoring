package udemyLearningCode.arrays;

public class Permutation {

    /*
Permutation
Your are given two integer arrays. Write a program to check if they are permutation of each other.

Example

int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)
Output

true
     */

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        System.out.println(checkTwoArrays(array1, array2));
    }

    public static boolean checkTwoArrays(int[] arr1,int[] arr2){

        if(arr1.length!=arr2.length){
            return false;
        }
        int sum1=0;
        int sum2=0;
        int mul1=1;
        int mul2=1;
        for (int i = 0; i < arr1.length; i++) {
           sum1+=arr1[i];
           sum2+=arr2[i];
           mul1*=arr1[i];
           mul2*=arr2[i];
        }
        if(sum1==sum2&&mul1==mul2){
            return true;
        }
        return false;
    }
}
