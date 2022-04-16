package com.Leetcode.BinarySearch1;

public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
    int[] nums={3,5};
        System.out.println(specialArray(nums));
    }
    public static int countGreater(int[] nums, int x){
        int count = 0;
        for(int val:nums){
            if(val>=x) count++; // count the numbers which are >= x
        }
        return count;
    }

    public static int specialArray(int[] nums) {
        int lo = 0; // minimum value of x can be 0 if we won't get any greater or equal num.
        int hi = nums.length; // maximum value of x can be the size of array

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(countGreater(nums,mid)==mid) return mid;
            else if(countGreater(nums,mid)>mid) lo = mid+1; // if count is more than mid try bigger value
            else hi = mid-1; // if count is less than try for smaller values
        }
        return -1;
    }

}
