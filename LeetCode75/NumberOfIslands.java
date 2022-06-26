package com.Leetcode.LeetCode75;

public class NumberOfIslands {
    public static void main(String[] args) {

    }
    public static int numIslands(char[][] grid) {
        int count = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i =0; i < grid.length;i++) {
            for(int j =0; j < grid[0].length; j++) {
                if(grid[i][j] =='1' && visited[i][j] != 1) {
                    dfs(grid,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, int[][] visit,int a, int b) {
        visit[a][b] =1;
        if(a > 0 && grid[a-1][b] =='1' && visit[a-1][b] != 1) {
            dfs(grid,visit,a-1,b);
        }
        if(b > 0 && grid[a][b-1] =='1' && visit[a][b-1] != 1) {
            dfs(grid,visit,a,b-1);
        }
        if(a +1<grid.length && grid[a+1][b] =='1' && visit[a+1][b] != 1) {
            dfs(grid,visit,a+1,b);
        }
        if(b+1< grid[0].length && grid[a][b+1] =='1' && visit[a][b+1] != 1) {
            dfs(grid,visit,a,b+1);
        }
    }
}

