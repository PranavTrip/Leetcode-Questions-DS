package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class UniquePathsII {
    public static void main(String[] args) {
        int[][] grid={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(grid));

    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for (int[] row:dp){
            Arrays.fill(row,-1);
        }
        return tabulation(m,n,obstacleGrid,dp);
    }
    public static int paths(int m,int n,int[][] obstacles,int[][]dp){
        if(m>=0 && n>=0 && obstacles[m][n]==1){
            return 0;
        }
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        int up=paths(m-1,n,obstacles,dp);
        int left=paths(m,n-1,obstacles,dp);
        return dp[m][n]=up+left;
    }
    public static int tabulation(int m,int n,int[][] obstacles,int[][]dp){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacles[i][j]==1){
                    dp[i][j]=0;
                }
                else if(i==0 && j==0){
                    dp[i][j]=1;

                }
                else {
                    int up = 0;
                    int left = 0;
                    if (i > 0) {
                        up = dp[i - 1][j];
                    }
                    if (j > 0) {
                        left = dp[i][j - 1];
                    }
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}
