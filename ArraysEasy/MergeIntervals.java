package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,3}, {0,4}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }
            else{
                list.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[0][]);
    }
}
