package com.Leetcode.LeetCode75;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s="foo";
        String t="bar";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            //check key is present or not
            if(hm.containsKey(s.charAt(i)))
            {
                //key is present then the value should be equal if not return false.
                if(hm.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else
            {
                //If key is not present and value is present it should be return false;
                if(hm.containsValue(t.charAt(i)))
                    return false;
                hm.put(s.charAt(i),t.charAt(i));

            }
        }
        return true;
    }
}
