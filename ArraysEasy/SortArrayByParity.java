package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums={0,1,2};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]%2==0 || nums[start]==0){
                start++;
            }
            else if(nums[end]%2==0){
                swap(nums,start,end);
                start++;
                end--;
            }else{
                end--;
            }
        }
        return nums;
    }
    public static void swap(int[] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
