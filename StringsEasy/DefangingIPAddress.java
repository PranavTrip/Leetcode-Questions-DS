package com.Leetcode.StringsEasy;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String IP="104.102.96.1";
        System.out.println(defangIPaddr(IP));
    }
    public static String defangIPaddr(String address) {
        return (address.replace(".","[.]"));
    }
}
