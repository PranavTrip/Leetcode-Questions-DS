package com.Leetcode.ProgrammingSkills;

public class CountOddNumbersInAnInterval {
    public static void main(String[] args) {
        System.out.println(countOdds(798273637,970699661));
    }
    public static int countOdds(int low, int high) {
        return (high+1)/2-low/2;
    }
}
