package com.Leetcode.LinkedListEasy;

public class SwappingNodesinLinkedList {
    public static void main(String[] args) {

    }

    public static ListNode swapNodes(ListNode head, int k) {
        int [] arr = convertArrayToLL(head);
        int [] arr1=swapValues(arr,k);
        return convertLLtoArray(arr1);
    }

    public static int lengthOfLL(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;

    }

    public static int[] convertArrayToLL(ListNode head) {
        int len = lengthOfLL(head);

        int[] arr = new int[len];
        int index = 1;
        ListNode curr = head;
        while (curr != null) {

            arr[index] = curr.val;
            curr = curr.next;
        }
        return arr;
    }
    public static int [] swapValues(int [] arr, int k){
      int temp=arr[k];
      arr[k]=arr[arr.length-k+1];
      arr[arr.length-k+1]=temp;
      return arr;

    }
    public static ListNode convertLLtoArray(int [] arr){
        int n=arr.length;
        ListNode root = null;
        for (int i = 0; i < n; i++)
            root = insert(root, arr[i]);
        return root;
    }
    public static ListNode insert(ListNode root, int item)
    {
        ListNode temp = new ListNode();
        ListNode ptr;
        temp.val = item;
        temp.next = null;

        if (root == null)
            root = temp;
        else
        {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }
}
