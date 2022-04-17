package com.Leetcode.BinarySearch1;

public class SearchATwoDMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,3}};
        System.out.println(searchMatrix(matrix,3));
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
