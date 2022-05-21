package com.Leetcode.ArraysEasy;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats={4,1,5,9};
        int[] students={1,3,2,6};
        System.out.println(minMovesToSeat(seats,students));
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        int minMoves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0; i<seats.length; i++){
            minMoves+=Math.abs(seats[i]-students[i]);
        }
        return minMoves;
    }
}
