package com.Leetcode.BinarySearch1;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        long start=0;
        long end=n;
        while(start<=end){
            long mid=start+(end-start)/2;
            long curr=mid*(mid+1)/2;
            if(curr==n){
                return (int)(mid);
            }
            else if(curr>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return (int)(end);
    }
}
