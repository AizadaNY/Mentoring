package javalearningcode;

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
        int n = 2;
        flower.canPlaceFlowers(flowerbed, n);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int leftPointer = 0;
        int currentPointer = flowerbed[0];
        int count=0;
        for (int rightPointer = 1; rightPointer < flowerbed.length; rightPointer++) {
            if (currentPointer== 0 && currentPointer == leftPointer && currentPointer==flowerbed[rightPointer]) {
                count++;
                leftPointer=1;
            }else{
                leftPointer=currentPointer;
            }
            currentPointer=flowerbed[rightPointer];
        }
        if(leftPointer==0 && leftPointer==currentPointer){
            count++;
        }
        return count>=n;
    }
}
