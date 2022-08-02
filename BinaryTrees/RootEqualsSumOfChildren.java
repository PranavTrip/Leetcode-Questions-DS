package com.Leetcode.BinaryTrees;

public class RootEqualsSumOfChildren {
    public static void main(String[] args) {

    }

    public static boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
