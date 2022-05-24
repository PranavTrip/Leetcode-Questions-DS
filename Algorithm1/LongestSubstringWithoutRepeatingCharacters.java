package com.Leetcode.Algorithm1;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int cnt[] = new int[256];
        int ans = 0, ct = 0;
        int i = 0, j = 0;
        int ind = 0;
        while (j < s.length()) {
            ind = s.charAt(j);
            if (cnt[ind] == 1) {
                cnt[ind]++;
                int ind1 = 0;
                while (cnt[ind] > 1 && i < s.length()) {
                    ind1 = s.charAt(i);
                    cnt[ind1]--;
                    i++;
                }

            } else

                cnt[ind]++;
            ans = Math.max(ans, j - i + 1);
            j++;
        }

        return ans;
    }
}
