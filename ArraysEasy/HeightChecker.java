package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {

    }
    public static int heightChecker(int[] heights) {
        int[] arr= Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<heights.length;i++){
           if(heights[i]!=arr[i]){
               count++;
           }
        }
        return count;
    }
}
