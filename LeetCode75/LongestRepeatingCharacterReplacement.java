package com.Leetcode.LeetCode75;

import java.util.*;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

    }
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        Map<Character,Integer> hm = new HashMap<>();
        int n=s.length();
        int res=0;
        while(j<n){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            while((j-i+1)-Collections.max(hm.values())>k){
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}
