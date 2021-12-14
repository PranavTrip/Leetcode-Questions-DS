package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberinaMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {3,7,8},{9,11,13},{15,16,17}
        };
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            int smallestValueofJ=0;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]<matrix[i][smallestValueofJ]){
                    smallestValueofJ=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][smallestValueofJ]>matrix[i][smallestValueofJ]){
                    flag=false;
                }
            }
            if (flag){
                list.add(matrix[i][smallestValueofJ]);
            }
        }
        return list;
    }
}
