package com.Leetcode.StringsEasy;

public class ImplementstrStr {
    public static void main(String[] args) {
    String str="hello";
    String needle="ll";
        System.out.println(strStr(str,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        for(int i =0;i<haystack.length();i++){
            if(haystack.contains(needle)){
                return haystack.indexOf(needle);
            }
        }
        return -1;
    }
}
