package com.Leetcode.StringsEasy;

public class SplitStringInBalancedStrings {
    public static void main(String[] args) {
        String s="RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        int count=0;
        int balanced=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R'){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                balanced++;
            }

        }
        return balanced;
    }
}
