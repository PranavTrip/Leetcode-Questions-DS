package com.Leetcode.LeetCode75;

public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public static int firstBadVersion(int n) {
        int start=0;
        int end=n;
        while (start<end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end= mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int firstBadVersion1(int n){
        long l=1,r=(long)(n);
        while(l<=r){
            long mid = (l+r)/2;
            if(isBadVersion((int)mid))r = mid-1;
            else l = mid+1;
        }
        return (int)l;
    }

//    Hypothetical API to avoid errors
    public static boolean isBadVersion(int version){
        return true;
    }
}
