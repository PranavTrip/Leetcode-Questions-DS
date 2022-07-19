package com.Leetcode.ProgrammingSkills;

public class FindTheNearestPointThatHasSameXorYCoordinate {
    public static void main(String[] args) {
        int[][] points={{1,2},{3,1},{2,4},{2,3},{4,4}};
        int m=3;
        int n=4;
        System.out.println(nearestValidPoint(m,n,points));
    }
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int n=points.length;
        int index=-1;
        int distance=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(points[i][0]==x || points[i][1]==y){
                int cur_distance=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(cur_distance<distance){
                    index=i;
                    distance=cur_distance;
                }
            }
        }
        return index;
    }

}
