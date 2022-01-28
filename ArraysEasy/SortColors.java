package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
    int[] nums={1,2,0,2,1,0};
    sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;
        while (mid<=end){
            switch (nums[mid]){
                case 0: {
                    int temp = nums[mid];
                    nums[mid] = nums[start];
                    nums[start] = temp;
                    start++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp=nums[mid];
                    nums[mid]=nums[end];
                    nums[end]=temp;
                    end--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
