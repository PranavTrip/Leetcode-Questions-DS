package com.Leetcode.ArraysEasy;

public class TruncateSentence {
    public static void main(String[] args) {

    }
    public static String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split(" ");
        for(int i=0;i<k;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
