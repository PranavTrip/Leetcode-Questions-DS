package com.Leetcode.StringsEasy;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()){
            return false;
        }
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<s.length();i++){
            if(ch[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
}
