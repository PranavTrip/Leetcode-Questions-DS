package com.Leetcode.LeetCode75;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
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
}
