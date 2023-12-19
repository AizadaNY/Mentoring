package javaLearningCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumber {

    /*
    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number
    of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the
    extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

    Note that multiple kids can have the greatest number of candies.
     */



    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList=new ArrayList<>();
        int[] tempArray=candies;
        Arrays.sort(tempArray);
        int max=tempArray[candies.length-1];
        System.out.println(Arrays.toString(tempArray));

        for (int i = 0; i < candies.length; i++) {
            boolean result;
            if((candies[i]+extraCandies)>max){
                result=true;
            }else{
                result=false;
            }
            resultList.add(result);
        }
       return resultList;
    }

    public void test(){
        int[] candies={3,5,8,2};
         Arrays.sort(candies);
        int max=candies[candies.length-1];
        System.out.println(max);
    }

    public static void main(String[] args) {

        KidsWithTheGreatestNumber kids=new KidsWithTheGreatestNumber();
        int[] candies={3,5,8,2};
        int extra=4;



        System.out.println( kids.kidsWithCandies(candies, extra));

    }


    /*





    code code




    jafkjdgfkkwhadewh
     */
}
