package com.Leetcode.StringsEasy;

public class BinaryStringWithOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "1011";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        int i =0;
        boolean found = false;
        while(i<s.length()){
            while(i< s.length() && s.charAt(i)=='1'){
                i++;
                if(found){
                    return false;
                }
            }
            found = true;
            i++;
        }
        return found;
    }
}
