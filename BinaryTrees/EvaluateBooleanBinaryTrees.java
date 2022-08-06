package com.Leetcode.BinaryTrees;

public class EvaluateBooleanBinaryTrees {
    public static void main(String[] args) {

    }

    public static boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        if (root.val == 1) {
            return true;
        }
        if (root.val == 0) {
            return false;
        }
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        }
       else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }

    }
}
