package com.Leetcode.ArraysEasy;

public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println(numIdenticalParts(nums));
    }
    public static int numIdenticalParts(int[] nums){
        int goodPairs=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}
