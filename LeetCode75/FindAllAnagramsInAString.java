package com.Leetcode.LeetCode75;

import java.util.*;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new LinkedList<>();
        if(p.length()>s.length()){
            return res;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

        int begin=0,end=0;
        int counter=map.size();
        int len=0;

        while(end<s.length()){
            char ec=s.charAt(end);
            if(map.containsKey(ec)){
                map.put(ec,map.get(ec)-1);
                if(map.get(ec)==0) counter--;
            }
            end++;

            while(counter==0){
                char bc=s.charAt(begin);
                if(map.containsKey(bc)){
                    map.put(bc,map.get(bc)+1);
                    if(map.get(bc)>0) counter++;
                }
                if(end-begin==p.length()){
                    res.add(begin);
                }
                begin++;
            }
        }
        return res;
    }
}
