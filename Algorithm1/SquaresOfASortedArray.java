package com.Leetcode.Algorithm1;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
    int [] nums={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        int i= 0;
        int k= nums.length-1;
        int j= nums.length-1;
        int [] ans=new int[nums.length];
        while (i<=j){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];
            if(a<b){
                ans[k]=b;
                j--;
            }
            else{
                ans[k]=a;
                i++;
            }
            k--;
        }
        return ans;
    }

    public static int[] sortedSquares1(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
