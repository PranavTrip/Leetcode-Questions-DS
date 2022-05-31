package com.Leetcode.Algorithm1;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {

    }
    public int minimumTotal(List<List<Integer>> tri) {
        int n = tri.size();
        int m = tri.get(n-1).size();

        int[] dp = new int[m];

        for(int i=0; i<m; i++) {
            dp[i] = tri.get(n-1).get(i);
        }

        int it = 1;
        System.out.println(Arrays.toString(dp));
        for(int i=n-2; i>=0; i--) {
            for(int j=0; j<m-it; j++) {
                dp[j] = tri.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
            it++;
        }

        return dp[0];
    }
}
