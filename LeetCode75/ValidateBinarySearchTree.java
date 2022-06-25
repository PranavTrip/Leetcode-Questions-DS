package com.Leetcode.LeetCode75;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

    }
    public static boolean isValidBST(TreeNode root) {
        return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private static boolean isBST(TreeNode root,long min,long max)
    {
        if(root==null)
        {
            return true;
        }
        return((root.val>min) && (root.val<max) && (isBST(root.left,min,root.val)) && (isBST(root.right,root.val,max)));
    }
}
