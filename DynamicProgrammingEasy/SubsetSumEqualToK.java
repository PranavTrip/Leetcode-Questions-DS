package com.Leetcode.DynamicProgrammingEasy;

public class SubsetSumEqualToK {
    public static void main(String[] args) {

    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        boolean[] prev= new boolean[k+1];

        prev[0]=true;


        if(arr[0]<=k){
            prev[arr[0]]=true;
        }
        for(int i=1;i<n;i++){
            boolean[] cur=new boolean[k+1];
            cur[0]=true;
            for(int j=1;j<=k;j++){

                boolean notTake=prev[j];
                boolean take=false;
                if(j>=arr[i]){
                    take=prev[j-arr[i]];
                }
                cur[j]=notTake||take;
            }
            prev=cur;
        }
        return prev[k];

    }
    public static boolean f(int ind,int[] arr, int n, int k,int[][]dp){
        if(k==0){
            return true;
        }
        if(ind==0){
            if(arr[ind]==k){
                return true;
            }
            return false;
        }
        if(dp[ind][k]!=-1){
            return dp[ind][k]==0?false:true;
        }
        boolean notTake=f(ind-1,arr,n,k,dp);
        boolean take=false;
        if(k>=arr[ind]){
            take=f(ind-1,arr,n,k-arr[ind],dp);
        }
        dp[ind][k]=take||notTake?1:0;
        return take||notTake;
    }
}
