package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class SmallerthanCurrentNumber {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] newArray=new int[nums.length];
        newArray=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums){

        int [] newArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int smallerNumber=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && j!=i){
                   newArray[i]= ++smallerNumber;
                    //System.out.println(smallerNumber);
                }
            }


        }
        return newArray;
    }
}
