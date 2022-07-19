package com.Leetcode.ProgrammingSkills;

public class SubtractTheSumAndProductOfDigitsOfAnInteger {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while (n!=0){
            int temp=n%10;
            n/=10;
            product*=temp;
            sum+=temp;
        }
        return product-sum;
    }
}
