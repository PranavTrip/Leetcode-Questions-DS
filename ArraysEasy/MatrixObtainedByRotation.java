package com.Leetcode.ArraysEasy;

public class MatrixObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] target={{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length-1;
        boolean possible = true;

        for(int i = 0;i <= n;i++) {                   //#1 for  360 degree
            for(int j = 0;j <=n; j++) {
                if(mat[i][j] != target[i][j]) {
                    possible = false;
                    break;
                }
            }
        }


        if(possible)
            return true;
        else
            possible = true;



        for(int i = 0;i <= n;i++) {  //                //# 2 for   90 degree
            for(int j = n;j >= 0;j--) {
                if(mat[j][i] != target[i][n-j]) {
                    possible = false;
                    break;
                }
            }
        }


        if(possible)
            return true;
        else
            possible = true;


        for(int i = 0;i <= n;i++)  {                    //#3 for  180 degree
            for(int j = n;j >= 0;j--) {
                if(mat[n-i][j] != target[i][n-j]) {
                    possible = false;
                    break;
                }
            }
        }


        if(possible)
            return true;
        else
            possible = true;


        for(int i = 0;i <= n;i++)  {                 //#4 for  270 degree
            for(int j = 0;j <= n;j++) {
                if(mat[j][n-i] != target[i][j]) {
                    possible = false;
                    break;
                }
            }
        }

        return possible;
    }
}
