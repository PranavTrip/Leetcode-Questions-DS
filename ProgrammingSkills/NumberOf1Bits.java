package com.Leetcode.ProgrammingSkills;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(3));
    }
    public static int hammingWeight(int n) {
        int count=0;
        while (n!=0){
            int rsbm=n & -n;
            n-=rsbm;
            count++;
        }
        return count;
    }
}
