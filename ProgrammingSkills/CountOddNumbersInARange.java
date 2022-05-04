package com.Leetcode.ProgrammingSkills;

public class CountOddNumbersInARange {
    public static void main(String[] args) {
        System.out.println(countOdds(3,7));
    }
    public static int countOdds(int low, int high) {
       return (high + 1) / 2 - low / 2;
    }
}
