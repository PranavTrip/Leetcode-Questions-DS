package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class TransposeofMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length] [matrix.length];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}
