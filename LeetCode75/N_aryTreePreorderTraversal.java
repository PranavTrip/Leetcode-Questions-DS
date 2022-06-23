package com.Leetcode.LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal {
    public static void main(String[] args) {

    }
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null){
            return list;

        }
        helper(root);
        return list;

    }
    public void helper(Node root){
        if(root==null){
            return ;
        }
        list.add(root.val);
        for(Node node:root.children){
            helper(node);
        }
    }
}
;
