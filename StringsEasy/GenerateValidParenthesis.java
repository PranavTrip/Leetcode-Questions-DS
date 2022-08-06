package com.Leetcode.StringsEasy;

import java.util.*;

public class GenerateValidParenthesis {
    public static void main(String[] args) {

    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        return solve(n,n,"",ans);
    }
    public static List<String> solve(int open,int end,String res,List<String> ans){

        if(open ==0 || end==0){
            ans.add(res);

        }

        if(open!=0){
            String res1=res;
            res1+="(";
            solve(open-1,end,res1,ans);

        }
        if(end>open){
            String res1=res;
            res1+=")";
            solve(open,end-1,res1,ans);
        }
        return ans;
    }
}
