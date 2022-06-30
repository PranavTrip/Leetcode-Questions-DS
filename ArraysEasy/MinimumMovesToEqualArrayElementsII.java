package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {
    public static void main(String[] args) {

    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int midIndex=0;
        int count=0;
        if(n%2!=0){
            midIndex=n/2;
        }
        else{
            midIndex=(n+1)/2;
        }
        for(int i=0;i<n;i++){
            count+=Math.abs(nums[i]-nums[midIndex]);
        }
        return count;
    }
}
