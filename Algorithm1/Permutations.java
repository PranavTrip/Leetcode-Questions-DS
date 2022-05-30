package com.Leetcode.Algorithm1;

import java.util.LinkedList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        int k = fact(nums.length);
        backtrack(list, result, nums, visited);

        return result;
    }

    private static int fact(int n){
        int mul = 1;
        for(int i=n ; i>=1; i--){
            mul *= i;
        }
        return mul;
    }

    private static void backtrack(LinkedList<Integer> list, List<List<Integer>> result,
                           int[] nums, boolean[] visited){
        if(list.size() == nums.length){
            result.add(new LinkedList<>(list));
            return;
        }

        for(int i=0; i< nums.length; i++){
            int n = nums[i];
            if(visited[i]){
                continue;
            }

            visited[i] = true;
            list.add(n);
            // System.out.println(list);

            backtrack(list, result, nums, visited);
            list.removeLast();
            visited[i] = false;

        }

        return;
    }


}
