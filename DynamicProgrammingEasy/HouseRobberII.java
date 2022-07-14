package com.Leetcode.DynamicProgrammingEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        if(nums.length==1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                l1.add(nums[i]);
            }
            if (i != nums.length - 1) {
                l2.add(nums[i]);
            }
        }
        int ans1 = solve(l1);
        int ans2 = solve(l2);
        return Math.max(ans1, ans2);
    }

    public static int solve(List<Integer> list) {
        int prev = list.get(0);
        int prev2 = 0;
        for (int i = 1; i < list.size()-1; i++) {
            int pick = list.get(i);
            if (i > 1) {
                pick += prev2;
            }
            int notPick = prev;
            int curr_i = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr_i;
        }
        return prev;
    }
}
