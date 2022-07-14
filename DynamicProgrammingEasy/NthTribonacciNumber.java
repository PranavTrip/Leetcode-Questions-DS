package com.Leetcode.DynamicProgrammingEasy;

import java.util.Arrays;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return findTribonacci(4, dp);
    }

    public static int findTribonacci(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = findTribonacci(n - 1, dp) + findTribonacci(n - 2, dp) + findTribonacci(n - 3, dp);
    }
}
