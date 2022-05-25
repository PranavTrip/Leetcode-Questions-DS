package com.Leetcode.LinkedListEasy;

public class DeleteANodeInALinkedList {
    public static void main(String[] args) {

    }
    public static void deleteNode(ListNode node) {
    node.val=node.next.val;
    node.next=node.next.next;

    }
}
