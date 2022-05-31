package com.Leetcode.Algorithm1;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {

    }
    int dp[] = new int[101];
    void Solution(){
        Arrays.fill(dp, -1);
    }
    public int rob(int[] nums) {
        return check(nums, nums.length);
    }
    public int check(int[] nums, int n){
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(dp[n] != -1) return dp[n];
        return dp[n] = Math.max(check(nums, n-1), nums[n-1]+check(nums, n-2));
    }
}
