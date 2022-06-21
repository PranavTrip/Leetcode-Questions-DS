package com.Leetcode.ArraysEasy;

public class CountGoodTriplets {
    public static void main(String[] args) {

    }
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int res=0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1;j<n-1; j++){
                if(Math.abs(arr[i]-arr[j])>a){
                    continue;
                }
                for(int k=j+1; k<n; k++){

                    if( Math.abs(arr[k]-arr[j])<=b && Math.abs(arr[i]-arr[k])<=c){
                        res++;
                    }
                }
            }
        }
        return res;
    }

}
