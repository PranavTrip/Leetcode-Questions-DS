package com.Leetcode.ArraysEasy;

public class BestTimetoBuyandSellStocks {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit=0;
        int minimum=prices[0];
        for(int i=0;i<prices.length;i++){
            minimum=Math.min(minimum,prices[i]);
            int maximumProfit=prices[i]-minimum;
            profit=Math.max(profit,maximumProfit);
        }
        return profit;
    }
}
