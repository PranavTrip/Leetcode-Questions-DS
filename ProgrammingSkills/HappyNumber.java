package com.Leetcode.ProgrammingSkills;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        int slow=0;
        int fast=getSum(n);
        while (slow!=fast && fast!=1){
            slow=getSum(slow);
            fast=getSum(getSum(fast));

        }
        return fast==1;
    }
    public static int getSum(int n){
        int sum=0;
        while (n>0){
            int temp=n%10;
            n/=10;
            sum+=temp*temp;
        }
        return sum;
    }
}
