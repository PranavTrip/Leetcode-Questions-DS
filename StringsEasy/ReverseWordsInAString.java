package com.Leetcode.StringsEasy;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
       for(int i=0;i<arr.length/2;i++){
           String temp=arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
       }
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<arr.length;i++){
           sb.append(arr[i]);
           sb.append(" ");
       }
        return sb.toString().trim().replaceAll("\\s"," ");


    }
}
