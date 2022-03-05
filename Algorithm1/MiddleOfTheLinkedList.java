package com.Leetcode.Algorithm1;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
