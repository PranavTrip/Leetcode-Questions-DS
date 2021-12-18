package com.Leetcode.StringsEasy;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
    String sequence="ababc";
    String word="ab";
        System.out.println(maxRepeating(sequence,word));
    }
    public static int maxRepeating(String sequence, String word) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        boolean flag=true;
        while (flag){
            if(sequence.contains(word+sb)){
                count++;
                sb.append(word);
            }
            else{
                flag=false;
            }
        }
        return count;
    }
}
