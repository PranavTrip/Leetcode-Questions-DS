package com.Leetcode.StringsEasy;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        int endIndex = word.indexOf(ch);
        StringBuilder sb = new StringBuilder();
        String s = word.substring(0, endIndex + 1);
        sb.append(s);
        sb.reverse();
        sb.append(word.substring(endIndex + 1, word.length()));
        return sb.toString().trim();
    }
}
