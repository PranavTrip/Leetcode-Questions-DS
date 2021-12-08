package com.Leetcode.ArraysEasy;

import java.util.List;

public class CountItemsmatchingaSearch {
    public static void main(String[] args) {


    }
    public static int countMatches(List<List<String>> items,String ruleKey,String ruleValue){
        int matches=0;
        int n =items.size();
        int ruleIndex = 0;
        if(ruleKey.equals("type"))
            ruleIndex=0;
        if(ruleKey.equals("color"))
            ruleIndex=1;
        if(ruleKey.equals("name"))
            ruleIndex=2;


        for (int i=0;i<n;i++){
            if(items.get(i).get(ruleIndex).equals(ruleValue)){
                matches++;
            }
        }
        return matches;
    }
}
