package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class PartitionArrayIntoTwoArraysWithMinDiff {
    public static void main(String[] args) {

    }
    public static int minimumDifference(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        boolean[][] dp=new boolean[nums.length][totalSum+1];
        for(int i=0;i< nums.length;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=totalSum){
            dp[0][nums[0]]=true;
        }
        for(int i=1;i< nums.length;i++){
            for(int j=0;j<=totalSum;j++){
                boolean notTake=dp[i-1][j];
                boolean take=false;
                if(nums[i]<=totalSum){
                    take=dp[i-1][j-nums[i]];
                }
                dp[i][j]=take||notTake;
            }
        }

        int mini=(int)Math.pow(10,9);
        for(int i=0;i<=totalSum;i++){
            if(dp[nums.length - 1][i]){
                int diff=Math.abs(i-(totalSum-i));
                mini=Math.min(mini,diff);
            }
        }
        return mini;

    }
    public static boolean f(int ind,int target,int[] nums,int[][]dp){
        if(target==0){
            return true;
        }
        if(ind==0){
            return nums[0]==target;
        }
        if(dp[ind][target]!=-1){
            return dp[ind][target]==1;
        }
        boolean notTake=f(ind-1,target,nums,dp);
        boolean take=false;
        if(nums[ind]<=target){
            take=f(ind-1,target-nums[ind],nums,dp);
        }
        dp[ind][target]=take||notTake?1:0;
        return take||notTake;
    }
}
