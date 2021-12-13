package com.Leetcode.ArraysEasy;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(diagonalSum(mat));
    }


    public static int diagonalSum(int[][] mat) {
        int lSum = 0;
        int rSum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    lSum += mat[i][j];
                }
                if (i + j == mat.length-1) {
                    if (i != j) {
                        rSum += mat[i][j];
                    }
                }

            }
        }
        return lSum+rSum;
    }
}
