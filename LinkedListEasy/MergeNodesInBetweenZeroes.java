package com.Leetcode.LinkedListEasy;

public class MergeNodesInBetweenZeroes {
    public static void main(String[] args) {

    }
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode next = head.next;

        while(next != null){
            if(next.val == 0){
                curr.next = next.next;
                curr = curr.next;
                next = next.next;
            } else {
                curr.val += next.val;
            }

            if(next == null) continue;
            next = next.next;
        }
        return head;
    }
}
