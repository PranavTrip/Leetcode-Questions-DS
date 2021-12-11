package com.Leetcode.SearchingEasy;

public class GuessNumberHigherorLower {
    public static void main(String[] args) {

    }
    public static int guessNumber(int n){
        int start=1;
        int end=n;
        int mid=start+(end-start)/2;
        int ans=guess(mid);
        while (start<=end){

            if(ans==n){
                return mid;
            }
            else if(ans==-1){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return mid;
    }
}
