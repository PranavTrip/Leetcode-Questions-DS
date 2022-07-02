package com.Leetcode.LeetCode75;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {

    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<String, Integer>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }

        Comparator<Map.Entry<String, Integer>> comparator = (a, b) ->
                a.getValue().equals(b.getValue()) ?
                        a.getKey().compareTo(b.getKey()) :
                        b.getValue().compareTo(a.getValue());

        PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<>(freq.size(), comparator);

        q.addAll(freq.entrySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (q.isEmpty()) break;
            result.add(q.poll().getKey());
        }
        return result;
    }
}
