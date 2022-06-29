package com.Leetcode.StringsEasy;

public class SubstringOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] != arr[i + 1] && arr[i + 1] != arr[i + 2] && arr[i] != arr[i + 2]) {
                count++;
            }
        }
        return count;
    }

}
