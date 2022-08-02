package com.Leetcode.ProgrammingSkills;
import java.util.*;
public class CheckIfOneSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        String s1 = "kanb";
        String s2 = "bank";
        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                ans.add(i);
            }
        }

        if (ans.size() == 2) {
            int x = ans.get(0);
            int y = ans.get(1);

            if (s1.charAt(x) == s2.charAt(y) && s1.charAt(y) == s2.charAt(x)) return true;
        }
        return false;
    }
}
