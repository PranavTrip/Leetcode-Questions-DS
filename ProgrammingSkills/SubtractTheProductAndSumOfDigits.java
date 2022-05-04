package com.Leetcode.ProgrammingSkills;

public class SubtractTheProductAndSumOfDigits {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
    public static int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while (n!=0){
            int temp=n%10;
            product*=temp;
            sum+=temp;
            n/=10;
        }
        return product-sum;
    }
}
