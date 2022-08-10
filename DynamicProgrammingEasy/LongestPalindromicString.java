package com.Leetcode.DynamicProgrammingEasy;

import java.util.List;

public class LongestPalindromicString {
    public static void main(String[] args) {

    }
    public static String longestPalindrome(String s) {

    }
    public static void helper(int index, List<String> list,String s){
        if(index>=s.length()){
            list.add(s);
            return;
        }
        list.add(s.charAt(index));

    }
}
