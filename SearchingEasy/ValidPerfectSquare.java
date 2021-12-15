package com.Leetcode.SearchingEasy;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
    public static boolean isPerfectSquare(int num) {
        long start=1;
        long end=num;
        boolean flag=false;
        while (start<=end){
            long mid=start+(end-start)/2;
            long ans=mid*mid;
            if(ans==num){
                flag=true;
                break;
            }
            else if(ans>num){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return flag;
    }
}
