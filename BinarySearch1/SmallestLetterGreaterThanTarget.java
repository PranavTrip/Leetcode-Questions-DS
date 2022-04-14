package com.Leetcode.BinarySearch1;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]==target){
                return letters[mid];
            }
            else if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start];
    }
}
