package com.Leetcode.ProgrammingSkills;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0) {
            count = count + (n & 1);
            n = n >>> 1; // Unsigned Shift Operation
        }
        return count;
    }
}
