package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {

        int k = 0;

        for (int i = 0; i < digits.length; i++) {
            k = 10 * k + digits[i];
        }
        k++;



        String newSum = Integer.toString(k);
        int[] newArray = new int[newSum.length()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newSum.charAt(i) - '0';
        }
        return newArray;
    }
}
