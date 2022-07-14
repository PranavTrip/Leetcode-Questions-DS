package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        int n = nums.length;
        System.out.println(rob(nums,n));
    }
    public static int rob(int[] nums,int n) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return spaceOptimisation(nums,n);
    }
    public static int solve(int ind,int[] nums,int[]dp,int n){
        if(ind==0){
            return nums[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick=solve(ind-2,nums,dp,n) + nums[ind];
        int notPick= solve(ind - 1, nums,dp,n);
        return dp[ind]=Math.max(pick,notPick);
    }
    public static int tabulation(int[] nums,int[] dp,int n){
        dp[0]=nums[0];
        for(int i=1;i< nums.length;i++){
            int pick=nums[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int notPick=dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        return dp[nums.length-1];
    }
    public static int spaceOptimisation(int[] nums,int n){
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i< nums.length;i++){
            int pick=nums[i];
            if(i>1){
                pick+=prev2;
            }
            int notPick=prev;
            int curr_i=Math.max(pick,notPick);
            prev2=prev;
            prev=curr_i;
        }
        return prev;
    }
}
