package com.Leetcode.BinarySearch1;


import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstandLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0]=binaryOnLeft(nums,target);
        arr[1]=binaryOnRight(nums,target);
        return arr;
    }
    public static int binaryOnLeft(int [] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int result=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result=mid;
                end=mid-1;

            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
    public static int binaryOnRight(int [] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int result=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result=mid;
                start=mid+1;

            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}

