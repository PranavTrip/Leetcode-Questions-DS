package com.Leetcode.MathEasy;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(
                -2147483648
        ));
    }
    public static int reverse(int x) {
        boolean isNegative=false;
        if(x<0){
            isNegative=true;
            x=-x;
        }
        long reversed=0;
        while (x>0){
            int temp=x%10;
            x/=10;
           reversed=reversed*10+temp;
        }
        if(reversed>Integer.MAX_VALUE){
            return 0;
        }
        return (int)(isNegative?reversed:-reversed);
    }
}
