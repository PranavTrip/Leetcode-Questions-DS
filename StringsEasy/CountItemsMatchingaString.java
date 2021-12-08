package com.Leetcode.StringsEasy;

import java.util.List;

public class CountItemsMatchingaString {
    public static void main(String[] args) {


    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int ruleIndex = 0;
        if (ruleKey.equals("type")) {
            ruleIndex = 1;
        }
        if (ruleKey.equals("color")) {
            ruleIndex = 2;
        }
        if (ruleKey.equals("name")) {
            ruleIndex = 3;
        }
        for(int i=0;i< items.size();i++){
            if(items.get(i).get(ruleIndex).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
