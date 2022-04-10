package com.Leetcode.BinarySearch1;

public class BinarySearch {
    public static void main(String[] args) {
    int[] nums={5};
        System.out.println(search(nums,5));
    }
    public static int search(int[] nums, int target) {
        int low=0;
        int high= nums.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
