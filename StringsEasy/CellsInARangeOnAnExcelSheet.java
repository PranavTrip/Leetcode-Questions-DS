package com.Leetcode.StringsEasy;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static void main(String[] args) {

    }
    public static List<String> cellsInRange(String s) {
        List<String> list= new ArrayList<String>();
        for(char i=s.charAt(0);i<=s.charAt(3);i++){
            for(char j=s.charAt(1);j<=s.charAt(4);j++){
                String str=Character.toString(i)+Character.toString(j);
                list.add(str);
            }
        }
        return (List)list;
    }
}
