package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {

    }
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else{
            int k=sum/2;
            boolean[][]dp=new boolean[nums.length][k+1];
            for(int i=0;i< nums.length;i++){
                dp[i][0]=true;
            }
            if(nums[0]<=k){
                dp[0][nums[0]]=true;
            }
            for(int i=1;i< nums.length;i++){
                for(int j=0;j< nums.length;j++){
                    boolean notTake=dp[i-1][j];
                    boolean take=false;
                    if(nums[i]<=k){
                        take=dp[i-1][j-nums[i]];
                    }
                    dp[i][j]=take||notTake;
                }
            }
            return dp[nums.length-1][k];
        }
    }
    public static boolean f(int ind,int tar,int[] arr,int[][]dp){
        if(ind==0){
            if(arr[ind]==tar){
                return true;
            }
            return false;
        }
        if(dp[ind][tar]!=-1){
            return dp[ind][tar] == 1;
        }
        boolean notTake=f(ind-1,tar,arr,dp);
        boolean take=false;

        if(arr[ind]<=tar){
            take=f(ind-1,tar-arr[ind],arr,dp);
        }
        dp[ind][tar]=take||notTake?1:0;
        return take||notTake;
    }
}
