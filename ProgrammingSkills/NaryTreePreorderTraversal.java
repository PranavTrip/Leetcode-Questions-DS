package com.Leetcode.ProgrammingSkills;

import java.util.*;

public class NaryTreePreorderTraversal {
    public static void main(String[] args) {

    }
    static List<Integer> list=new ArrayList<>();
    public static List<Integer> preorder(Node root) {
        if(root==null){
            return list;

        }
        helper(root);
        return list;

    }
    public static void helper(Node root){
        if(root==null){
            return ;
        }
        list.add(root.val);
        for(Node node:root.children){
            helper(node);
        }
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
