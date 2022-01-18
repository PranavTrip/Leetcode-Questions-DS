package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int [][] result=new int[r][c];
        int setColumn=0;
        int setRow=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(setColumn==c){
                    setRow++;
                    setColumn=0;
                }
                result[setRow][setColumn]=mat[i][j];
                setColumn++;
            }
        }
        return result;
    }
}
