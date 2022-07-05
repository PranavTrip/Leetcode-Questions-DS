package com.Leetcode.ArraysEasy;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int num:nums1)
            set1.add(num);

        for(int num:nums2)
            set2.add(num);

        set1.retainAll(set2); // this will retain all set1 elements that are present in set2.
        int[] output=new int[set1.size()];
        int index=0;
        for(int num:set1)
            output[index++]=num;

        return output;
    }
}
