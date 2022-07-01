package com.Leetcode.LeetCode75;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));

    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
       /* StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();*/
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (alphabet(ch)) {
                st1.push(ch);
            } else if (ch == '#' && !st1.empty()) {
                st1.pop();
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (alphabet(ch)) {
                st2.push(ch);
            } else if (ch == '#' && !st2.empty()) {
                st2.pop();
            }
        }
        return isSameStack(st1, st2);
    }

    public static boolean alphabet(Character s) {
        return s >= 'a' && s <= 'z';
    }

    public static boolean isSameStack(Stack<Character> s1, Stack<Character> s2) {
        boolean flag = true;
        if (s1.size() != s2.size()) {
            flag = false;
            return flag;
        }
        while (!s1.empty()) {
            if (s1.peek() == s2.peek()) {
                s1.pop();
                s2.pop();
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
