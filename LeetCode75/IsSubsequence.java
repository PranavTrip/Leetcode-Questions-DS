package com.Leetcode.LeetCode75;

import java.util.List;

public class IsSubsequence {
    public static void main(String[] args) {

    }
    public static boolean isSubsequence(String s, String t) {
        if(t.length()<s.length())
            return false;
        if(s.length()==0)
            return true;
        int k=0;
        for(int i=0;i<t.length();i++)
        {
            if(s.charAt(k)==t.charAt(i))
                k++;
            if(k==s.length())
                return true;
        }
        return false;
    }

}
