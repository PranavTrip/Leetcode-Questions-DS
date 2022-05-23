package com.Leetcode.StackEasy;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {

    }
    Stack<Integer> stk;
    int min = Integer.MAX_VALUE;


    public MinStack() {
        stk = new Stack<>();
    }

    public void push(int val) {
        if (val <= min) {
            stk.push(min);
            min = val;
        }
        stk.push(val);
    }

    public void pop() {
        int peek = stk.pop();
        if (peek == min){
            min = stk.pop();
        }
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return min;
    }
}
