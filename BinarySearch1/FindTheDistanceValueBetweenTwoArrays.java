package com.Leetcode.BinarySearch1;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {

    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=arr1.length;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(i-j)<=d){
                    ans-=1;
                    break;
                }
            }
        }
        return ans;
    }
}
