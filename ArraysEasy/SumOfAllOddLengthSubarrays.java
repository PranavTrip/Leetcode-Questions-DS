package com.Leetcode.ArraysEasy;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr={1,2};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=1;i<=n;i+=2){
            for(int j=0;j<n-i+1;j++){
                for(int k=j;k<j+i;k++){
                    sum+=arr[k];
                }
            }
        }
        return sum;
    }
}
