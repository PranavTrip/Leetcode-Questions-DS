package com.Leetcode.StringsEasy;

import java.util.Stack;

public class MaximumNestingDepthOfParanthesis {
    public static void main(String[] args) {
        String s =  "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepthWithoutStack(s));
    }

    public static int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
                count = st.size();
            }
            if (ch == ')') {
                st.pop();
                maxCount =Math.max(maxCount,count);


            }
        }
        return maxCount;
    }
    public static int maxDepthWithoutStack(String s){
        int maxDepth=0,depth=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                depth++;
            }
            if(ch==')'){
                maxDepth=Math.max(maxDepth,depth);
                depth--;

            }
        }
        return maxDepth;
    }
}
