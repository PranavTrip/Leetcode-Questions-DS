package com.Leetcode.ArraysEasy;

public class PangramSentence {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence){
        for (char i='a';i<='z';i++)
            if(!(sentence.contains(String.valueOf(i))))
                return false;



        return true;
    }
}
