package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class DivisorGame {
    public static void main(String[] args) {

    }
    public static boolean divisorGame(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);
    }
    public static boolean f(int n,int[] dp){
        boolean flag=false;
        if(n==1){
            return false;
        }
        if(dp[n]!=-1){
            return dp[n]==1;
        }
        for(int i=1;i<n;i++){
            if(n%i==0 && !f(n-i,dp)){
                if(flag){
                    dp[n]=1;
                }
                return flag=true;
            }
        }
        if(!flag){
            dp[n]=0;
        }
        return false;

    }

}
