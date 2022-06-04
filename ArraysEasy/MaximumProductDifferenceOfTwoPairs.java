package com.Leetcode.ArraysEasy;

public class MaximumProductDifferenceOfTwoPairs {
    public static void main(String[] args) {

    }
    public static int maxProductDifference(int[] nums) {
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i : nums){
            if(i >= first_max){
                second_max = first_max;
                first_max = i;
            }
            else if( i >= second_max && i <= first_max){
                second_max = i;
            }

            if(i <= first_min){
                second_min = first_min;
                first_min = i;
            }
            else if ( i <= second_min && i >= first_min){
                second_min = i;
            }
        }

        int val = (first_max * second_max) - (first_min * second_min);
        return val;

    }
}
