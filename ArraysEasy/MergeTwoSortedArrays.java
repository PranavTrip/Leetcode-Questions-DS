package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
       // merge2(nums1, 3, nums2, 3);
        merge(nums1,3,nums2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = nums1.length - m;
        for (int i = m; i < (m + n); i++) {
            nums1[i] = nums2[--count];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge2(int[] nums1,int m, int[] nums2,int n){
        ArrayList<Integer> list=new ArrayList<>();
        int first=0;
        int second=0;
        while (first<m && second<n){
            if(nums1[first]<nums2[second]){
                list.add(nums1[first]);
                first++;
            }
            else{
                list.add(nums2[second]);
                second++;
            }
        }
        while (first<m){
            list.add(nums1[first]);
            first++;
        }
        while (second<n){
            list.add(nums2[second]);
            second++;
        }
        System.out.println(list);
    }


}
