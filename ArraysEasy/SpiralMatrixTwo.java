package com.Leetcode.ArraysEasy;

public class SpiralMatrixTwo {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int minRow=0;
        int minCol=0;
        int maxRow= arr.length;
        int maxCol=arr[0].length;
        int total= arr.length* arr.length;
        int count=0;
        while (count<total){
            /*top wall*/
            if(count<total){
                for(int i=minCol;i<maxCol;i++){
                    System.out.println(arr[minRow][i]);
                    count++;
                }
            }
            minRow++;
            if(count<total){
                for (int i=maxRow;i>=minRow;i--){
                    System.out.println(arr[maxCol][i]);
                    count++;
                }
            }
            maxCol++;
        }
    }
    /*public static int[][] generateMatrix(int n) {

    }*/
}
