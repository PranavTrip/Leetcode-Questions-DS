package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
    int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int original=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[original]){
                int tmp = nums[i]; //swap element
                nums[i] = nums[original];
                nums[original] = tmp;
            }
            else
                i++;
        }
        for(int index=0;index<nums.length;index++){ //linear Search
            if(nums[index]!=index)
                return index;
        }
        return nums.length;
    }
}
