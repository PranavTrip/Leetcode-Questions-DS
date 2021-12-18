package com.Leetcode.StringsEasy;

public class BinaryStringWithOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "1011";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        int i =0;
        boolean flag = false;
        while(i<s.length()){
            while(i< s.length() && s.charAt(i)=='1'){
                i++;
                if(flag){
                    return false;
                }
            }
            flag = true;
            i++;
        }
        return flag;
    }
}
