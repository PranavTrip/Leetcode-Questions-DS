package com.Leetcode.ArraysEasy;

public class SearchIn2DMatrix2 {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,13));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int rows=matrix.length;
        int col=matrix[0].length;
        int i=0;
        int j=col-1;
        while (i>=0 && i<rows && j>=0 && j<col){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{

                i++;
            }
        }
        return false;
    }
}
