package com.Leetcode.SearchingEasy;

import java.util.ArrayList;
import java.util.List;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        System.out.println(findKthPositive(arr));
    }
    public static List<Integer> findKthPositive(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
       for(int i=1;i<=arr.length-1;i++){
           if (arr[i]!=i){
               list.add(i);
           }
       }
       return list;

    }
}
