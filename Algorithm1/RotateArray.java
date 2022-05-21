package com.Leetcode.Algorithm1;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
    int [] nums={1,2,3,4,5,6,7};
        rotate(nums,3);
    }

    public static void rotate(int[] nums, int k) {
        k=k% nums.length;
        if(k<0){
            k+= nums.length;
        }
        reverse(nums,0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1 );
        reverse(nums,0, nums.length-1);
        //System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int li, int ri) {

        while (li < ri) {
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            li++;
            ri--;
        }
       // System.out.println(Arrays.toString(nums));
    }

}
