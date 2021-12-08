package com.Leetcode.ArraysEasy;

public class FlippinganImage {
    public static void main(String[] args) {

    }
    public static void flipAndInvertImage(int[][] image){
        for(int i=0;i<image.length;i++){
            int[] reversedArray=reverse(image[i]);
            for(int j=0;j< reversedArray.length;j++){
                if(reversedArray[j]==0){
                    reversedArray[j]=1;
                }
                if(reversedArray[j]==1){
                    reversedArray[j]=0;
                }
            }
        }
    }
    public static int[] reverse(int [] originalArray){
        int start=0;
        int end=originalArray.length-1;
        while (start<end){
            int temp=originalArray[start];
            originalArray[start]=originalArray[end];
            originalArray[end]=temp;
            start++;
            end--;
        }
        return originalArray;
    }
}
