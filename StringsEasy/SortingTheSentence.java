package com.Leetcode.StringsEasy;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String arr[]=s.split(" ");
        String arr1[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String t=arr[i];
            char x=t.charAt(t.length()-1);
            int t1=x-'0';
            arr1[t1-1]=t.substring(0,t.length()-1);
        }
        String ans="";
        for(int i=0;i<arr1.length;i++){
            ans+=arr1[i]+" ";
        }
        ans=ans.trim();
        return ans;
    }
}
