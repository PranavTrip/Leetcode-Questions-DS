package com.Leetcode.LeetCode75;

import javax.swing.*;
import java.util.List;

public class LinkedListCycleII {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        fast=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;

    }
}
