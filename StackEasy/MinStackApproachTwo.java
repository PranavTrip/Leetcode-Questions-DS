package com.Leetcode.StackEasy;

import java.util.ArrayList;

class MinStackApproachTwo {
    ArrayList<Integer> list;
    int min = Integer.MAX_VALUE;

    public MinStackApproachTwo() {
        list = new ArrayList<>();

    }

    public void push(int val) {
        list.add(val);
    }

    public void pop() {
        int index = list.size() - 1;
        if(list.get(index)<=min){
            min=list.get(index);
        }
        list.remove(index);
    }

    public int top() {
        int index = list.size() - 1;
        return list.get(index);
    }

    public int getMin() {

        for(int i=0;i<list.size();i++){
            if(list.get(i)<=min){
                min=list.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
