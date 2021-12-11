package com.Leetcode.SearchingEasy;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
    public static int mySqrt(int x){
        int start=0;
        int end=x;
        int ans=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            int square=mid*mid;
            if(square==x){
                return mid;
            }
            if(square>x){
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}
