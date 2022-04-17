package com.Leetcode.BinarySearch1;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives1(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
    public static int countNegatives1(int[][] grid){
        int cnt = 0;
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++) {
            int s = 0, e = n;
            boolean foundNeg = false;
            while(s < e) {
                int mid = s + (e-s)/2;
                if(grid[i][mid] < 0) {
                    e = mid;
                    foundNeg = true;
                } else {
                    s = mid+1;
                }
            }
            cnt += foundNeg ? n-e : 0;
        }
        return cnt;
    }
}
