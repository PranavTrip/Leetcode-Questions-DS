package com.Leetcode.LinkedListEasy;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        while (temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}
