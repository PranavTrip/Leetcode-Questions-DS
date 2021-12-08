package com.Leetcode.ArraysEasy;

import java.util.*;

public class KidswithGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxElement = Integer.MIN_VALUE;
        ArrayList<Boolean> list = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxElement) {
                maxElement = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {


            System.out.println(maxElement);
            if ((candies[i] + extraCandies) >= maxElement) {
                list.add(true);

                System.out.println(list);
            } else {
                list.add(false);
            }
        }

        return list;
}
}
