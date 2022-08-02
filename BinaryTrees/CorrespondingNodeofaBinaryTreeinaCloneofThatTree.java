package com.Leetcode.BinaryTrees;

public class CorrespondingNodeofaBinaryTreeinaCloneofThatTree {
    public static void main(String[] args) {

    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target){

        if(cloned.val==target.val){
            return cloned;
        }

        TreeNode left=null;
        TreeNode right=null;

        if(cloned.left!=null){
            right=getTargetCopy(original,cloned.left,target);
            if(right!=null)
                return right;
        }

        if(cloned.right!=null){
            left=getTargetCopy(original,cloned.right,target);
            if(left!=null)
                return left;
        }
        return null;
    }

}
