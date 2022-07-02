package com.Leetcode.LeetCode75;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {

    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1){
            int p = maxHeap.poll();
            int q = maxHeap.poll();

            if(p != q){
                maxHeap.offer(p-q);
            }
        }
        return maxHeap.size() == 0 ? 0 : maxHeap.peek();
    }
}
