package com.Leetcode.ArraysEasy;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int maximumSum=nums[0];
        for(int i=0;i<nums.length;i++){
            currentSum=Math.max(nums[i], currentSum+nums[i]);
            maximumSum=Math.max(currentSum,maximumSum);
        }
        return maximumSum;
    }
}
