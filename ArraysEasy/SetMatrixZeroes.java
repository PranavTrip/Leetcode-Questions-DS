package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {

    }
    public static void setZeroes(int[][] matrix) {
        int[] rowMatrix=new int[matrix.length];
        int[] colMatrix=new int[matrix[0].length];
        Arrays.fill(rowMatrix,-1);
        Arrays.fill(colMatrix,-1);
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowMatrix[i]=0;
                    colMatrix[j]=0;
                }
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(rowMatrix[i]==0 || colMatrix[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
