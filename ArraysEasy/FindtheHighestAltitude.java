package com.Leetcode.ArraysEasy;

public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));

    }
    public static int largestAltitude(int[]gain){
        int maxAltitude=Integer.MIN_VALUE;
        int lowest=0;
        for(int i=0;i<gain.length;i++){
         lowest+=gain[i];
         if(maxAltitude<lowest){
             maxAltitude=lowest;
         }
        }
        return maxAltitude;
    }

}
