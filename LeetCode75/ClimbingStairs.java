package com.Leetcode.LeetCode75;

public class ClimbingStairs {
    public static void main(String[] args) {

    }
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }

        int secondLast = 1;
        int last = 2;

        int res = 0;

        for(int i=3;i<=n;i++){
            res= secondLast+last;
            secondLast = last;
            last= res;
        }
        return last;
    }

}
