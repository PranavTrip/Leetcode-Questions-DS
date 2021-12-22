package com.Leetcode.RecursionEasy;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(14));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;
    }
}
