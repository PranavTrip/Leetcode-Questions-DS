package com.Leetcode.ArraysEasy;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {

    }
    public static boolean isValidSudoku(char[][] board) {
        return validRow(board,9)&& validColumn(board,9)&& validBox(board,6,6);
    }
    public static boolean validRow(char[][] board,int row){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i< 9;i++){
            if(hs.contains(board[row][i])){
                return false;
            }
            if(board[row][i]!='.'){
                hs.add(board[row][i]);
            }

        }
        return true;
    }
    public static boolean validColumn(char[][] board,int col){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i< 9;i++){
            if(hs.contains(board[i][col])){
                return false;
            }
            if(board[i][col]!='.'){
                hs.add(board[i][col]);
            }

        }
        return true;
    }
    public static boolean validBox(char[][] board,int r,int c){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                char ch=board[i+r][j+c];
                if(hs.contains(ch)){
                    return false;
                }
                if(ch!='.'){
                    hs.add(ch);
                }
            }
        }
        return true;
    }
}
