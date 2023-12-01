package udemyLearningCode.arrays;

import java.util.Arrays;

public class DublicateElements {


   /*
   Write a function which takes integer array as a parameter and returns
   a new integer array with unique elements. (remove duplicates)
   Example
   removeDuplicates({1, 1, 2, 2, 3, 4, 5})
   Output : [1, 2, 3, 4, 5]
    */
   public static void main(String[] args) {

       int [] arr={1, 1, 2, 2, 3, 4, 5};
       getUniqueNumbers(arr);
   }


    public static void getUniqueNumbers(int[] arr){
        int n=arr.length;
        int [] uniqueArr=new int[n];
        int index=0;
        for (int i = 0; i < n; i++) {
            boolean isDublicate=false;
            for (int j = i+1; j <n ; j++) {
              if(arr[i]==arr[j]){
                  isDublicate=true;
                  break;
              }
            }
            if(!isDublicate){
                uniqueArr[index++]=arr[i];
            }
        }
        uniqueArr=Arrays.copyOf(uniqueArr, index);
        System.out.println(Arrays.toString(uniqueArr));
    }

    public static void removeDuplicates(int[] arr){
       int i=0;
       if(arr.length==0){
           System.out.println("No element to show");
       }

        for (int j = 1; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

    }

}

