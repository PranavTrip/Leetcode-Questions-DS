package com.Leetcode.LeetCode75;

public class DecodeString {
    public static void main(String[] args) {

    }
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0, l = 0, r = 0, open = 0;
        char[] str = s.toCharArray();

        while(r < str.length) {
            if(Character.isAlphabetic(str[r])) {
                sb.append(str[r]);
                r++;
                continue;
            }

            while(str[r] != '[') {
                count = count * 10 + str[r] - '0';
                r++;
            }
            open++;
            l = ++r;

            while(open > 0) {
                if(str[r] == '[') {
                    open++;
                } else if(str[r] == ']') {
                    open--;
                }
                r++;
            }


            String sub = decodeString(s.substring(l, r - 1));

            while(count > 0) {
                sb.append(sub);
                count--;
            }
        }

        return sb.toString();
    }
}
