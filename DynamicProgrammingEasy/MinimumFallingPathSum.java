package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public static void main(String[] args) {

    }

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = matrix[i][j] + dp[i - 1][j];
                int left = matrix[i][j];
                if (j - 1 >= 0) {
                    left += dp[i - 1][j - 1];
                } else {
                    left += (int) (Math.pow(10, 9));
                }
                int right = matrix[i][j];
                if (j + 1 < m) {
                    right += dp[i - 1][j + 1];
                } else {
                    right += (int) (Math.pow(10, 9));
                }
                dp[i][j] = Math.min(up, Math.min(left, right));
            }
        }
        int mini = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            mini = Math.min(dp[n - 1][j], mini);
        }
        return mini;
    }

    public static int f(int i, int j, int[][] a, int n, int[][] dp) {
        if (j < 0 || j >= a[0].length) {
            return (int) Math.pow(10, 9);
        }
        if (i == 0) {
            return a[i][j];
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int up = a[i][j] + f(i - 1, j, a, n, dp);
        int left = a[i][j] + f(i - 1, j - 1, a, n, dp);
        int right = a[i][j] + f(i - 1, j + 1, a, n, dp);
        return dp[i][j] = Math.min(up, Math.min(left, right));
    }
}
