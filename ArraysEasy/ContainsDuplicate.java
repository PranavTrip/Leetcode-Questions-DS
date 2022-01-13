package com.Leetcode.ArraysEasy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
       // boolean isDuplicate = false;
        Set<Integer> set1 = new HashSet<>();
        for (int i :nums) {
            if (!set1.add(i)) {
                return true;

            }

        }
        return false;
    }
}
