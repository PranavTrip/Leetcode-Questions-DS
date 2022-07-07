package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    public static int climbStairs(int n) {
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return countStairs(n,dp);
    }
    public static int countStairs(int n,int[] dp){
        dp[0]=1;
        dp[1]=1;
        if(n<=1){
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=countStairs(n-1,dp)+countStairs(n-2,dp);
        return dp[n];
    }
}
