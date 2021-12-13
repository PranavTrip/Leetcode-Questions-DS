package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr={1,2,0,0};
        int k=34;
        System.out.println(addToArrayForm(arr,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=num.length-1; i>=0 || k>0; i--){
            if(i>=0){
                list.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }else{
                list.add(k%10);
                k/=10;
            }
        }
        Collections.reverse(list);
        return list;
    }

}
