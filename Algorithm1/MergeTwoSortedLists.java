package com.Leetcode.Algorithm1;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        ListNode temp1=list1;
        ListNode temp2=list2;

        if(list1==null || list2==null){
            return list1==null?list2:list1;
        }
        while (temp1!=null && temp2!=null){
            if(temp1.val< temp2.val){
                prev.next=temp1;
                temp1=temp1.next;
            }
            else{
                prev.next=temp2;
                temp2=temp2.next;
            }
            prev= prev.next;
        }
        prev.next=temp1==null?temp2:temp1;
        return dummy.next;
    }

}
