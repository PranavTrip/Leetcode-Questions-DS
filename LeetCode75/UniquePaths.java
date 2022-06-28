package com.Leetcode.LeetCode75;

public class UniquePaths {
    public static void main(String[] args) {

    }
    public static int uniquePaths(int m, int n) {
        double res = 1;

        for (int i = 1; i <= n-1; i++) {
            res = res * (m-1+i) / i;
        }
        return (int)res;
    }
}
