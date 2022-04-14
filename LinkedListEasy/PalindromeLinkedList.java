package com.Leetcode.LinkedListEasy;

import java.util.ArrayList;

public class PalindromeLinkedList {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp.next.next!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        ArrayList<Integer> newlist=new ArrayList<>();
        for(int i=list.size();i>=0;i--){
            newlist.add(list.get(i));
        }

        return list.equals(newlist);
    }
}
