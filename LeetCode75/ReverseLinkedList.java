package com.Leetcode.LeetCode75;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode temp=null;
        ListNode curr=head;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }
}
