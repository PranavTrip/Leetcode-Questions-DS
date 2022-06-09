package com.Leetcode.ArraysEasy;

public class FirstPalindromicStringInArray {
    public static void main(String[] args) {
        String[] arr = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(isPalindrome("ada"));
        System.out.println(firstPalindrome(arr));
    }

    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                return words[i];
            }


        }
        return "";
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString().equals(s);
    }
}
