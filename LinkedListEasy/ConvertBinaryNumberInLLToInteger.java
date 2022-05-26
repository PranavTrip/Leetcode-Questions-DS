package com.Leetcode.LinkedListEasy;

public class ConvertBinaryNumberInLLToInteger {
    public static void main(String[] args) {

    }
    public static int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = (num << 1) | head.next.val;
            head = head.next;
        }
        return num;
    }
}
