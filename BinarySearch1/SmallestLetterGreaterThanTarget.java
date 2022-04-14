package com.Leetcode.BinarySearch1;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while ( left < right ){
            int mid = ( left + right ) >>> 1;
            if ( letters[mid] > target )
                right = mid;
            else
                left = mid+1;
        }
        return letters[right] > target ? letters[right] : letters[0];
    }
}
