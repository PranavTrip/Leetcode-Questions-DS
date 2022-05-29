package com.Leetcode.Algorithm1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Combinations {
    public static void main(String[] args) {

    }
    static List<List<Integer>> result;
    public static List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        int arr[] = IntStream.range(1,n+1).toArray();
        int out[] = new int[k];
        combi(arr,0,0,k,out);
        return result;

    }

    public static void combi(int[]arr,int depth,int start,int r,int[] out){
        if(r==0){
            result.add(Arrays.stream(out).boxed().collect(Collectors.toList()));
            return;
        }else{
            for (int i = start; i < arr.length; i++) {
                out[depth] = arr[i];
                combi(arr,depth+1,i+1,r-1,out);
            }
        }
    }
}
