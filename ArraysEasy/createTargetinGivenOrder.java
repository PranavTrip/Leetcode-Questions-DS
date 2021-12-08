package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class createTargetinGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] target= createTarget(nums,index);
        System.out.println(Arrays.toString(target));

    }
    public static int[] createTarget(int[] nums, int[]index){
        int[] target=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for (int i=0;i<nums.length;i++){
            target[i]=list.get(i);
        }
        return target;
    }
}
