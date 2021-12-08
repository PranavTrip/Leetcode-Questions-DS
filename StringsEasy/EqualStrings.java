package com.Leetcode.StringsEasy;

public class EqualStrings {
    public static void main(String[] args) {
        String[] word1={"ab","c"};
        String[] word2={"a","bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String finalString1= "";
        String finalString2= "";
        for(int i=0;i< word1.length;i++){
            finalString1+=word1[i];
        }
        for(int i=0;i< word2.length;i++){
            finalString2+=word2[i];
        }
        return finalString1.equals(finalString2);
    }
}
