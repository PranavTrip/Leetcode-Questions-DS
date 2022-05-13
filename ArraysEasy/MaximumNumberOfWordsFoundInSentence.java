package com.Leetcode.ArraysEasy;

public class MaximumNumberOfWordsFoundInSentence {
    public static void main(String[] args) {
        String[] sentences={"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int len=0;
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            String[] ch=str.split(" ");
            len=Math.max(ch.length,len);
        }
        return len;
    }
}
