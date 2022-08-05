package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIV {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int target=4;
        System.out.println(combinationSum4(nums,target));
    }
    public static int combinationSum4(int[] nums, int target) {
        int [] dp=new int[target+1];
        Arrays.fill(dp,-1);
        return helper(nums,target,dp);
    }

    public static int helper( int[]nums, int target,int[] dp){
        if(target<0){
            return 0;
        }
        if(target==0){
            return 1;
        }
        if(dp[target]!=-1){
            return dp[target];
        }
        int ans=0;
        for(int i=0;i< nums.length;i++){
           ans+=helper(nums,target-nums[i],dp);
        }
        return dp[target]=ans;
    }
}
