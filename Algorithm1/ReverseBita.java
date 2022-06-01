package com.Leetcode.Algorithm1;

public class ReverseBita {
    public static void main(String[] args) {

    }
    public static int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();

        int count = 32;
        int num = n;
        int last = 0;

        while(count > 0)
        {
            last = num & 1;  //gives last digit
            sb.append(last);
            num = num >> 1;  //get num = num / 2;
            count--;
        }

        int ans = 0;
        int power =1;
        int l = sb.length() - 1;

        while(l >= 0)
        {
            char ch = sb.charAt(l);
            ans += Integer.parseInt(String.valueOf(ch)) * power;
            power = power << 1;  //get power = power * 2
            l--;
        }
        return ans;
    }
}
