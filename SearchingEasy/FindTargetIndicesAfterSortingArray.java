package com.Leetcode.SearchingEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums={1,2,5,2,3};
        System.out.println(targetIndices(nums,2));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        int count_less = 0;
        int count_target = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                count_target++;
            if (nums[i] < target)
                count_less++;
        }
        List<Integer> ans = new ArrayList<Integer>();
        while (count_target > 0) {
            ans.add(count_less++);
            count_target--;
        }
        return ans;
    }
}
