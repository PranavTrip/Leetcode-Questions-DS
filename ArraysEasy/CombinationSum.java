package com.Leetcode.ArraysEasy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public static void helper(int ind,int[] candidates,int target,List<Integer> list, List<List<Integer>> ans){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[ind]<=target){
            list.add(candidates[ind]);
            helper(ind,candidates,target-candidates[ind],list,ans);
            list.remove(list.size()-1);
        }
        helper(ind+1,candidates,target,list,ans);
    }
}
