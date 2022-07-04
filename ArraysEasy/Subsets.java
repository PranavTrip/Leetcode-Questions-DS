package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void getSubsets(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        getSubsets(nums, index + 1, list, result);
        list.remove(list.size() - 1);
        getSubsets(nums, index + 1, list, result);
    }

}
