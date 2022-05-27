package com.Leetcode.Algorithm1;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static void main(String[] args) {

        }

        public static int orangesRotting(int[][] grid) {

            int count_fresh = 0;
            Queue<Pair> q = new LinkedList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2)
                        q.add(new Pair(i, j));
                    if (grid[i][j] == 1) {
                        grid[i][j] = -1;
                        count_fresh++;
                    }
                }
            }

            if (count_fresh == 0)
                return 0;

            return count_Minutes(grid, q, count_fresh);
        }

        public static int count_Minutes(int grid[][], Queue<Pair> q, int count_fresh) {

            int number_of_minute = 0;
            while (q.size() > 0) {
                int size = q.size();
                number_of_minute++;
                while (size-- > 0) {
                    Pair p = q.poll();
                    int i = p.x;
                    int j = p.y;

                    if (i - 1 >= 0 && grid[i - 1][j] == -1) {
                        grid[i - 1][j] = 2;
                        q.add(new Pair(i - 1, j));
                        count_fresh--;
                    }
                    if (j + 1 < grid[0].length && grid[i][j + 1] == -1) {
                        grid[i][j + 1] = 2;
                        q.add(new Pair(i, j + 1));
                        count_fresh--;
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == -1) {
                        grid[i + 1][j] = 2;
                        q.add(new Pair(i + 1, j));
                        count_fresh--;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == -1) {
                        grid[i][j - 1] = 2;
                        q.add(new Pair(i, j - 1));
                        count_fresh--;
                    }
                }
            }

            if (count_fresh == 0)
                return number_of_minute - 1;

            return -1;
        }

    }
}
