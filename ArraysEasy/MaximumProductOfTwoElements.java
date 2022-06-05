package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class MaximumProductOfTwoElements {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums[nums.length-1];
        int j=nums[nums.length-2];
        return (i-1)*(j-1);
    }
}
