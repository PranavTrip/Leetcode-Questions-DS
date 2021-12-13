package com.Leetcode.ArraysEasy;

public class FindNumberwithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            //If number of digits in the ith number are even increase the count by 1 else do nothing
            if (isEven(nums[i])) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static boolean isEven(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count % 2 == 0;
    }
}
