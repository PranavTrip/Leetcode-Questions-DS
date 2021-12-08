package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        int [] sum=runningSum(nums);
        System.out.println(Arrays.toString(sum));

    }
    public static int[] runningSum(int [] nums){
        int [] sum=new int[nums.length];
        int previousSum=0;
        for (int i = 0; i < nums.length ; i++) {
            sum[i]=nums[i]+previousSum;
            previousSum=sum[i];
        }
        return sum;
    }
}
