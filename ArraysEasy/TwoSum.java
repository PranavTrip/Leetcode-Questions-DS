package com.Leetcode.ArraysEasy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum3(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map1.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map1.containsKey(complement) && map1.get(complement) != i) {
                return new int[]{i, map1.get(complement)};
            }
        }
        return null;
    }


    /* Inefficient approach-Currently working on it */
    public static int[] twoSum3(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (i <= end) {
                int mid = start + (end - start) / 2 +1;
                if (nums[mid] == target - nums[i]) {
                    return new int[]{i,mid};
                } else if (nums[mid] > target - nums[i]) {
                    end = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
