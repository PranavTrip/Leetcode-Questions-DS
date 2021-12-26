package com.Leetcode.MathEasy;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverse = 0;
        int num = x;
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            reverse = reverse * 10 + temp;
        }
        return reverse == num;
    }
}
