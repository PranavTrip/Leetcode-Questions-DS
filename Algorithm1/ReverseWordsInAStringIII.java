package com.Leetcode.Algorithm1;

import java.util.Arrays;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder result = new StringBuilder();
        for (String ch : arr) {
            StringBuilder sb = new StringBuilder(ch);
            result.append(sb.reverse() + " ");
        }

        return result.toString().trim();
    }

}
