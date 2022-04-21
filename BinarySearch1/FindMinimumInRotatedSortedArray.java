package com.Leetcode.BinarySearch1;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {

        int left = 0, right = nums.length - 1;

        if(nums[right] >= nums[0]) return nums[0];

        while(left < right){
            int mid = (left + right) / 2;

            if(nums[mid] > nums[mid + 1])
                return nums[mid+1];

            if(nums[mid - 1] > nums[mid])
                return nums[mid];


            if(nums[mid] > nums[left])
                left = mid + 1;

            if(nums[mid] < nums[right])
                right = mid - 1;
        }
        return -1;
    }
}
