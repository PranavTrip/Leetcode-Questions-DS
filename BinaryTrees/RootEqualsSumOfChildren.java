package com.Leetcode.BinaryTrees;

public class RootEqualsSumOfChildren {
    public static void main(String[] args) {
    
    }
    public static boolean checkTree(TreeNode root) {
        int rootVal=root.val;
        int leftVal=root.left.val;
        int rightVal=root.right.val;
        return leftVal + rightVal == rootVal;
    }
}
