package com.Leetcode.LinkedListEasy;

public class SwapNodesInPairs {
    public static void main(String[] args) {

    }
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        if(head.next!=null){
            swapPairs(head.next.next);
        }
        return head;

    }
}
