package com.Leetcode.LinkedListEasy;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
    if(head==null){
        return head;
    }
    ListNode previousNode=null;
    ListNode currentNode=head;
    ListNode nextNode=currentNode.next;
     while (currentNode!=null){
         currentNode.next=previousNode;
         previousNode=currentNode;
         currentNode=nextNode;
         if(nextNode!=null){
             nextNode = nextNode.next;
         }
     }
     return previousNode;
    }
}
