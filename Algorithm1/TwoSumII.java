package com.Leetcode.Algorithm1;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int[] result=new int[2];
        while (start<=end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                result[0]=start+1;
                result[1]=end+1;
                break;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return result;
    }
}
