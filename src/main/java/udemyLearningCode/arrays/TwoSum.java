package udemyLearningCode.arrays;

import java.util.Arrays;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.

Examples

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]


Input: nums = [3,2,4], target = 6
Output: [1,2]
     */

    public static void main(String[] args) {
        int[] nums={2,4,5,7,8,2};
        int target=9;
       calculate(nums,target);
    }


    public static void calculate(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(result));

    }
}

