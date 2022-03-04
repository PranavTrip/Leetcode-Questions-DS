package com.Leetcode.Algorithm1;

public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int bad=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            /*if(isBadVersion(mid)){
                bad= mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }*/
        }
        return bad;
    }


}
