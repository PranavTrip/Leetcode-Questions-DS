package com.Leetcode.Algorithm1;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        int traverse = 0;
        int start = 0;
        int size = 0;

        HashSet<Character> hs = new HashSet<>();
        while (traverse < s.length()) {
            if (!hs.contains(s.charAt(traverse))) {
                hs.add(s.charAt(traverse));
                traverse++;
                size = Math.max(size, hs.size());
            } else {
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return size;
    }
}
