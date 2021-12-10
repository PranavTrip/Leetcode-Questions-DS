package com.Leetcode.StringsEasy;

import java.util.Arrays;

public class ReverseWordsinaString3 {
    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String str){
        String[] arr=str.split("\s");
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<arr.length;i++){
            StringBuilder sb1=new StringBuilder();
            sb1.append(arr[i]+" ".toString());
            sb1.reverse();
            sb.append(sb1);
        }
        return sb.toString().trim();
    }
}
