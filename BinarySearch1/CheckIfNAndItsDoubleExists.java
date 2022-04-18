package com.Leetcode.BinarySearch1;

import java.util.HashMap;

public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        int[] arr={10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer , Integer > map = new HashMap<>();

        for(int y=0 ; y<arr.length ; y++){
            if((map.containsKey(arr[y]*2) && map.get(arr[y]*2)!=y) ||
                    (arr[y]%2==0 && map.containsKey(arr[y]/2) && map.get(arr[y]/2)!=y))
                return true;
            map.put(arr[y] , y);
        }
        return false;
    }
}
