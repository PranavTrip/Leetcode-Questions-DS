package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        int[] arr=buildArray(nums);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] buildArray(int [] nums){
        int [] arr = new int [nums.length];
        for(int i=0;i< nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;

    }
}
