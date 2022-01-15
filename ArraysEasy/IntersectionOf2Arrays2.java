package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOf2Arrays2 {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,3};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result=new int[list.size()];
        for(int k=0;k< list.size();k++){
            result[k]= list.get(k);
        }
        return result;
    }
}
