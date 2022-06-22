package com.Leetcode.LeetCode75;

import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            if(set.contains(arr[i])){
                count+=2;
                set.remove(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
        return set.size()>0?count+1:count;
    }
}
