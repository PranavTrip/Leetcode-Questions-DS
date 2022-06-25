package com.Leetcode.LeetCode75;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;

        while(p.val < node.val && q.val < node.val || p.val > node.val && q.val > node.val) {
            node = p.val < node.val ? node.left : node.right;
        }

        return node;
    }
}
