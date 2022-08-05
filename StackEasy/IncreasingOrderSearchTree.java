package com.Leetcode.StackEasy;



import java.util.*;

public class IncreasingOrderSearchTree {
    public static void main(String[] args) {

    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        TreeNode ans=new TreeNode(0);
        TreeNode current=ans;
        for(int i:list){
            current.right=new TreeNode(i);
            current=current.right;
        }
        return ans.right;

    }
    public void inorder(TreeNode root,List<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
