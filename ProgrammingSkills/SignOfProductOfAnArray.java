package com.Leetcode.ProgrammingSkills;

public class SignOfProductOfAnArray {
    public static void main(String[] args) {

    }
    public static int arraySign(int[] nums) {
        int product=1;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                nums[i]=-1;
                product*=-1;
            }
            if(nums[i]>0){
                nums[i]=1;
            }
        }

        return product;
    }
}
