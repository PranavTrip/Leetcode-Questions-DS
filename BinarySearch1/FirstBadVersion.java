package com.Leetcode.BinarySearch1;

public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public static int firstBadVersion(int n) {
        int start=0;
        int end=n;
        int bad=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                bad=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return bad;
    }
    /*Hypothetical API use Leetcode API instead*/
    public static boolean isBadVersion(int n){
        return true;
    }
}
