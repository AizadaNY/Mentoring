package javaLearningCode;

public class CanPlaceFlower {
    /*
    ou have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.



Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
     */

    public static void main(String[] args) {
        CanPlaceFlower flower = new CanPlaceFlower();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        flower.canPlaceFlowers(flowerbed, n);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        boolean flower=false;
        while (n > 0 || i < flowerbed.length) {
            if (flowerbed[i] == 1) {
                i = i + 2;
            } else {
                if ((i + 1) != 1) {
                    n--;
                }

            }
            i++;
        }
        if(n==0){
            flower=true;
        }else {
            flower=false;
        }
        System.out.println(flower);
         return flower;
    }
}
