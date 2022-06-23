package com.Leetcode.StringsEasy;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;

        for(int j=0;j<words.length;j++) {
            String s=words[j];
            for (int i = 0; i < s.length(); i++) {
                if (allowed.contains(String.valueOf(s.charAt(i)))) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
