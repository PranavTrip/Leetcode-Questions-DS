package com.Leetcode.RecursionEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStrings {
    public static void main(String[] args) {
        char[] s= {'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {

        //Iterative Approach
        /*for(int i=0;i<s.length;i++){
            for(int j=0;j<i;j++){
                char temp= s[i];
                s[i]=s[j];
                s[j]=temp;
            }
        }
        System.out.println(Arrays.toString(s));*/

        //Recursive Approach
        int start=0;
        int end=s.length-1;
        reverse(s,start,end);
        System.out.println(Arrays.toString(s));
    }
    public static void reverse(char[] s,int start,int end){
        if(start>=end){
            return;
        }
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        reverse(s,start+1,end-1);
    }
}
