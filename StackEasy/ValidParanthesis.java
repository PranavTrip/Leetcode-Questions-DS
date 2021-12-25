package com.Leetcode.StackEasy;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "(}{)";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()!=0){
                    if(ch==')' && st.peek()!='('){
                        return false;
                    }
                    if(ch=='}' && st.peek()!='{'){
                        return false;
                    }
                    if(ch==']' && st.peek()!='['){
                        return false;
                    }
                }
                else{
                    return false;
                }
                st.pop();
            }
        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
