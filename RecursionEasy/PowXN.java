package com.Leetcode.RecursionEasy;

public class PowXN {
    public static void main(String[] args) {
        System.out.println(myPow(2,-1));
    }
    public static double myPow(double x, int n) {
        if(n>=0){
            return positive(x,n);
        }else{
            return negative(x,n);
        }
    }
    public static double positive(double x, int n){
        if(n==0){
            return 1;
        }
        double sO = myPow(x,n/2);
        if(n%2 == 0){
            return sO*sO;
        }else{
            return x*sO*sO;
        }
    }
    public static double negative(double x, int n){
        if(n == -1){
            return 1/x;
        }
        double sO = myPow(x,n/2);
        if(n%2 == 0){
            return sO*sO;
        }else{
            return 1/x*sO*sO;
        }
    }

}
