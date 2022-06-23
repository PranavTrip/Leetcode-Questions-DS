package com.Leetcode.MathEasy;

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(14));
    }
    public static int numberOfMatches(int n) {
        int matches=0;
        int teamRemaining=n;
        int sum=0;
        while (n>1){
            if(n%2!=0){
                matches=(n-1)/2;
                teamRemaining=n-matches;
            }
            else{
                matches=n/2;
                teamRemaining=n-matches;
            }
            sum+=matches;
            n=teamRemaining;
        }
        return sum;
    }
}
