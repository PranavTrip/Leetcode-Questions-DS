package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i = i + 2) {
            int count = nums[i];
            int value = nums[i+1];

            for (int j = 0; j < count; j++) {
                result.add(value);
            }
        }

        int[] arrayResult = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            arrayResult[i] = result.get(i);
        }

        return arrayResult;

    }
}
