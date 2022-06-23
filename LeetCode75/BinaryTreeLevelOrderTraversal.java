package com.Leetcode.LeetCode75;

import java.util.*;


public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> que = new LinkedList<>();

        if(root != null){
            que.add(root);
        }

        while(que.size() > 0){
            int size = que.size();

            List<Integer> ans = new ArrayList<>();

            for(int i=0; i < size; i++){
                TreeNode remove = que.remove();

                ans.add(remove.val);

                if(remove.left != null){
                    que.add(remove.left);
                }
                if(remove.right != null){
                    que.add(remove.right);
                }
            }
            res.add(ans);
        }
        return res;
    }
}

