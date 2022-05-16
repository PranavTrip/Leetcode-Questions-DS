package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
    int[] encoded={6,2,7,3};
        System.out.println(Arrays.toString(decode(encoded, 4)));
    }
    public static int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
}
