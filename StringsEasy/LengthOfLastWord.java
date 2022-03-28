package com.Leetcode.StringsEasy;

public class LengthOfLastWord {
    public static void main(String[] args) {

    }
    public static int lengthOfLastWord(String s) {
        String str=s.trim();
        String[] arr=str.split(" ");
        int n= arr.length;
        String s1=arr[n-1];
        return s1.length();
    }
}
