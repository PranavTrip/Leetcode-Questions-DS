package com.Leetcode.ArraysEasy;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {

    }
    public static int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(Math.abs(nums[i]-nums[j])==k ){
                    count++;
                }
            }
        }
        return count;
    }
}
