package com.Leetcode.Algorithm1;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {

    }
    public static List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        char[] input = s.toCharArray();
        letterCasePermutation(input, 0, result, new char[input.length]);
        return result;
    }

    private static void letterCasePermutation(char[] input, int index, List<String> result, char[] currResult) {
        if (index == input.length) {
            result.add(new String(currResult));
            return;
        }
        currResult[index] = input[index];
        letterCasePermutation(input, index + 1, result, currResult);
        if (!Character.isDigit(input[index])) {
            if (Character.isUpperCase(input[index])) {
                currResult[index] = Character.toLowerCase(input[index]);
            } else {
                currResult[index] = Character.toUpperCase(input[index]);
            }
            letterCasePermutation(input, index + 1, result, currResult);
        }
    }
}
