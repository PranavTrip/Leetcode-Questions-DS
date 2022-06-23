package com.Leetcode.MathEasy;

public class XORoperationInAnArray {
    public static void main(String[] args) {
        int n=5;
        int start=0;
        System.out.println(xorOperation(n,start));
    }
    public static int xorOperation(int n, int start) {
        int result=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=start+2*i;
            result=result^arr[i];
        }
        /*for(int i=0;i<n;i++){
            result=result^arr[i];
        }*/
        return result;
    }
}
