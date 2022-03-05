package com.Leetcode.Algorithm1;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
        {
            return null;
        }
        // we create a windo b/ w slow and fast pointer so we  move fast pointer by n times and then move slow and fast one by one
        ListNode slow=head;
        ListNode fast=head;

        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        if(fast==null)
        {
            return head.next;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

    }
}
