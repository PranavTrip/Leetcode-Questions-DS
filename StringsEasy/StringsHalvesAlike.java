package com.Leetcode.StringsEasy;

public class StringsHalvesAlike {
    public static void main(String[] args) {
        String s = "AbCdEfGh";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        String newS=s.toLowerCase();
        int count1=0;
        int count2=0;

        for(int i =0;i<s.length()/2;i++){
            char ch=newS.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count1++;
            }
        }
        for(int i =s.length()/2;i<s.length();i++){
            char ch=newS.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count2++;
            }
        }
        return count1==count2;
    }

}
