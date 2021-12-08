package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class ConcatenationOfArrays {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int [] ans= getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] getConcatenation(int [] nums){
        int [] ans = new int[2*nums.length];
        for(int i=0;i< nums.length;i++){
            if(i<= nums.length){
                ans[i]=nums[i];
            }
            
                ans[i+ nums.length]=nums[i];

        }
        return ans;
    }
}
