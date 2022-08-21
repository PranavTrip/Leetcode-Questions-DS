package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int target=3;
        System.out.println(findTargetSumWays(nums,target));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int totalSum=0;

        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        if(totalSum-target<0){
            return 0;
        }
        if((totalSum-target)%2==1){
            return 0;
        }
        int s=(totalSum-target)/2;
        int[][] dp=new int[nums.length][s+1];
        for (int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(nums.length - 1, s, nums,dp);
    }

    public static int f(int ind, int target, int[] arr,int[][] dp) {
        if (ind == 0) {
           if(target==0 && arr[0]==0){
               return 2;
           }
           if(target==0 || target==arr[0]){
               return 1;
           }
        }
        if(dp[ind][target]!=-1){
            return dp[ind][target];
        }
        int notTake = f(ind - 1, target, arr,dp);
        int take = 0;
        if (arr[ind] <= target) {
            take = f(ind - 1, target - arr[ind], arr,dp);
        }
        return dp[ind][target]=take + notTake;
    }
}
