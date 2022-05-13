package com.Leetcode.ArraysEasy;

public class FindValueAfterPerformingOperations {
    public static void main(String[] args) {

    }
    public static int finalValueAfterOperations(String[] operations) {
        int num=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                num++;
            }
            else{
                num--;
            }
        }
        return num;
    }
}
