package com.Leetcode.StringsEasy;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String s="G()(al)";
        System.out.println(interpret(s));
    }
    public static String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");

    }

}
