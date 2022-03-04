package com.Leetcode.Algorithm1;

public class SearchInsertPosition {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {

                //System.out.println(mid);
                return mid;
            }
            // middle = mid;

        }
        return start;
    }
}
