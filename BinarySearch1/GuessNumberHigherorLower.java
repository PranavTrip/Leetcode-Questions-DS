package com.Leetcode.BinarySearch1;

public class GuessNumberHigherorLower {
    public static void main(String[] args) {

    }
    public int guessNumber(int n) {
        int start=0;
        int end=n;
        while(true){
            int target=start+(end-start)/2;
            if(guess(target)==0){
                return target;
            }
            else if(guess(target)==-1){
                end=target-1;
            }
            else{
                start=target+1;
            }
        }
    }
    /* Hypothetical method : use LeetCode api instead */
    public int guess(int num){
        return 0;
    }
}
