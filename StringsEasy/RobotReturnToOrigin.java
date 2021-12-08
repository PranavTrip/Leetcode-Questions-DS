package com.Leetcode.StringsEasy;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves="UD";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        int leftCount=0;
        int rightCount=0;
        int upCount=0;
        int downCount=0;

        for(int i=0;i< moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L'){
                leftCount++;
            }
            if(ch=='R'){
                rightCount++;
            }
            if(ch=='U'){
                upCount++;
            }
            if(ch=='D'){
                downCount++;
            }
        }
        return leftCount==rightCount && upCount==downCount;
    }
}
