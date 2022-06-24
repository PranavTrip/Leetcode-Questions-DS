package com.Leetcode.StringsEasy;

import java.util.*;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        List<Boolean> consistentTable = new ArrayList<>();
        int count = 0;
        for(int i=0; i<words.length; i++){
            boolean output = true;
            for(int j=0; j<words[i].length(); j++){
                if(!allowed.contains(String.valueOf(words[i].charAt(j)))){
                    output = false;
                    break;
                }
            }
            consistentTable.add(output);
        }

        for(Boolean bool: consistentTable)
            if(bool) count++;

        return count;
    }
}
