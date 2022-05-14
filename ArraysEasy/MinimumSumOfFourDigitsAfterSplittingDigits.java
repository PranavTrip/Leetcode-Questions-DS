package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class MinimumSumOfFourDigitsAfterSplittingDigits {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }
    public static int minimumSum(int num) {
        int[] ans=new int[4];
        int i=0;
        while (num>0){
            ans[i]=num%10;
            num/=10;
            i++;
        }
        Arrays.sort(ans);
        return (ans[0]*10+ans[2]+ans[1]*10+ans[3]);
    }
}
