package com.Leetcode.QueueEasy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

    }
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    public void MyQueue()
    {
        stack1=new Stack<Integer>();
        stack2=new Stack<Integer>();
    }

    public void push(int x)
    {
        /*push the first element directly into stack1 */
        if(stack1.size()==0)
            stack1.push(x);
        else
        {
            /*from 2nd element onwards first pop all elements of stack1
              and push to stack2(helping stack) and now push element to
              the bottom of empty stack1, so it should be processed last.*/
            while(stack1.size()>0)
            {
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            /*now pop all the elements of stack2 and push to stack1 hence
			the first element inserted comes to top of stack1 and
			insertion to stack1 will become FIFO*/
            while(stack2.size()>0)
            {
                stack1.push(stack2.pop());
            }
        }
    }

    public int pop()
    {

        return stack1.pop();
    }

    public int peek()
    {
        return stack1.peek();

    }

    public boolean empty()
    {
        return stack1.size() <= 0;
    }

}
