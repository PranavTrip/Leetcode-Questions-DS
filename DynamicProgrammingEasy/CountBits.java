package com.Leetcode.DynamicProgrammingEasy;

public class CountBits {
    public static void main(String[] args) {

    }
    public static int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int setBits=countSetBits(i);
            arr[i]=setBits;
        }
        return arr;
    }
    public static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
