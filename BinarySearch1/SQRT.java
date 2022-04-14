package com.Leetcode.BinarySearch1;

public class SQRT {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        long start=0;
        long end=x;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return (int)end;
    }
}
