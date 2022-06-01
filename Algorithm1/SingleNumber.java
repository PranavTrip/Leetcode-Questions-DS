package com.Leetcode.Algorithm1;

public class SingleNumber {
    public static void main(String[] args) {

    }
    public static int singleNumber(int[] nums) {
        int x=0;
        for(int a:nums){
            x=x^a;
        }
        return x;
    }
}
