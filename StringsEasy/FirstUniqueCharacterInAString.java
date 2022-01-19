package com.Leetcode.StringsEasy;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s) {
       HashMap<Character,Integer> hm=new HashMap<>();
       char[] ch=s.toCharArray();
       for(int i=0;i<ch.length;i++){
           hm.put(ch[i],i);
       }
       for(int i=0;i<ch.length;i++){
           if(hm.containsKey(ch[i])){
               if(i==hm.get(ch[i])){
                   return i;
               }
               else {
                   hm.remove(ch[i]);
               }
           }
       }
       return -1;
    }
}
