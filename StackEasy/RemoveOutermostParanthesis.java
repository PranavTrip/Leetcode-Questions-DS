package com.Leetcode.StackEasy;

import java.util.Stack;

public class RemoveOutermostParanthesis {
    public static void main(String[] args) {

    }
    public static String removeOuterParentheses(String s) {
        String ans="";
        int start=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                st.pop();
            }
            if(st.isEmpty())
            {
                ans=ans+s.substring(start+1,i);
                start=i+1;
            }
        }
        return ans;
    }
}
