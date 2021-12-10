package com.Leetcode.StringsEasy;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isValidCharacter(ch)) {
                sb.append(ch);
            }
        }
        String st1 = sb.toString();
        String st2 = sb.reverse().toString();
        return st1.equals(st2);
    }

    public static boolean isValidCharacter(char ch) {
        return ((ch>='0' && ch <= '9') || (ch >= 'a' && ch <= 'z'));
    }
}
