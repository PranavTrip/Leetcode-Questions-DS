package com.Leetcode.BinarySearch1;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
    int [] arr={1,2,3,4};
        System.out.println(findKthPositive(arr,2));
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int missing = compute(arr[n - 1], n + 1);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            missing = compute(arr[mid], mid + 1);
            if (missing >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (right == -1) {
            return k;
        }
        return arr[right] + k - compute(arr[right], right + 1);
    }

    public static int compute(int actual, int expected) {
        return actual - expected;
    }
}
