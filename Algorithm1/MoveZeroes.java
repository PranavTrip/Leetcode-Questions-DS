package com.Leetcode.Algorithm1;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int i = 0;
        int j = i+1;

        while (j< nums.length){
            if (nums[i] == 0 && nums[j]!=0) {
                swap(nums, i, j);
                i++;

            }
            else if(nums[i]!=0){
                i++;
                j++;
            }
            else{
               j++;
            }
        }
        //System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int li, int ri) {
        int temp = nums[li];
        nums[li] = nums[ri];
        nums[ri] = temp;
       // System.out.println(Arrays.toString(nums));
    }
}
