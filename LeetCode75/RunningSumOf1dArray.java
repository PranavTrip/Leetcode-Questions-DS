package com.Leetcode.LeetCode75;

import java.util.Arrays;

public class RunningSumOf1dArray{
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}
