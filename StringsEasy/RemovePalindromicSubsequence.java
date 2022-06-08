package com.Leetcode.StringsEasy;

import java.util.Arrays;

public class RemovePalindromicSubsequence {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(removePalindromeSub(s));
    }
    public static int removePalindromeSub(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString().equals(s)?1:2;
    }
}
