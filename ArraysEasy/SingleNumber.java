package com.Leetcode.ArraysEasy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int x=0;
        for(int a:nums){
            x=x^a;
        }
        return x;
    }
}
