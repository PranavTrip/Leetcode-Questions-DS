package com.Leetcode.Algorithm1;

import java.util.Arrays;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
    String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String fin = "";
        String arr[] = s.split(" ");
        for(int i = 0;i<arr.length;i++){
            StringBuilder str = new StringBuilder(arr[i]);
            fin += (str.reverse()).toString();
            fin += " ";
        }
        return fin.substring(0,fin.length()-1);
    }

}
